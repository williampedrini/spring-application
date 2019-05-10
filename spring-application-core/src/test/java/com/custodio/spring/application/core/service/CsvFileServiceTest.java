package com.custodio.spring.application.core.service;

import com.custodio.spring.application.core.bean.AirportCsvBean;
import com.custodio.spring.application.core.configuration.root.BaseTestRunner;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Class responsible for executing unit tests for {@link CsvFileService}.
 *
 * @author wcustodio.
 */
public class CsvFileServiceTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_AIRPORTS = 46505;
    private static final String EXPECTED_ERROR_MESSAGE_FILE_WITHOUT_MAPPED_HEADER_FIELD = "Unrecognized field \"line_number\"";
    private static final String EXPECTED_ERROR_MESSAGE_FILE_WITHOUT_HEADER = "Unrecognized field \"6523\"";

    /**
     * Files used by the unit tests.
     */
    private static final String VALID_FILE = "/csv/valid_file.csv";
    private static final String FILE_WITHOUT_HEADER = "/csv/file_without_header.csv";
    private static final String FILE_WITHOUT_CONTENT = "/csv/file_without_content.csv";
    private static final String FILE_WITHOUT_MAPPED_HEADER_FIELD = "/csv/file_without_mapped_header_field.csv";

    @Autowired
    private CsvFileService csvFileService;

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void readValidFile() {
        try {
            final List<AirportCsvBean> beans = csvFileService.read(AirportCsvBean.class, new File(this.getClass().getResource(VALID_FILE).getPath()));
            Assert.assertNotNull(beans);
            Assert.assertFalse(beans.isEmpty());
            Assert.assertEquals(EXPECTED_AIRPORTS, beans.size());
            for (final AirportCsvBean bean : beans) {
                Assert.assertNotNull(bean.getId());
            }
        } catch (final IOException ioException) {
           Assert.fail(ioException.getMessage());
        }
    }

    @Test
    public void readFileWithoutHeader() throws IOException {
        expected.expect(IOException.class);
        expected.expectMessage(StringContains.containsString(EXPECTED_ERROR_MESSAGE_FILE_WITHOUT_HEADER));
        csvFileService.read(AirportCsvBean.class, new File(this.getClass().getResource(FILE_WITHOUT_HEADER).getPath()));
    }

    @Test
    public void readFileWithoutContent() throws IOException {
        try {
            final List<AirportCsvBean> beans = csvFileService.read(AirportCsvBean.class, new File(this.getClass().getResource(FILE_WITHOUT_CONTENT).getPath()));
            Assert.assertNotNull(beans);
            Assert.assertTrue(beans.isEmpty());
        } catch (final IOException ioException) {
            Assert.fail(ioException.getMessage());
        }
    }

    @Test
    public void readFileWithoutMappedHeaderField() throws IOException {
        expected.expect(IOException.class);
        expected.expectMessage(StringContains.containsString(EXPECTED_ERROR_MESSAGE_FILE_WITHOUT_MAPPED_HEADER_FIELD));
        csvFileService.read(AirportCsvBean.class, new File(this.getClass().getResource(FILE_WITHOUT_MAPPED_HEADER_FIELD).getPath()));
    }
}