package com.custodio.spring.application.core.service;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Service responsible for executing procedures related to a CSV file.
 *
 * @author wcustodio.
 */
@Service
public class CsvFileService {

    /**
     * Read a certain file and return and convert content into a specific type.
     * @param type Type to be converted.
     * @param file File to be read.
     * @param <T> Template of the type to be used in conversion.
     * @return List of the type.
     * @throws IOException Error while reading file.
     */
    public <T> List<T> read( final Class<T> type, final File file) throws IOException {
        final CsvSchema bootstrapSchema = CsvSchema.emptySchema().withHeader();
        final CsvMapper mapper = new CsvMapper();
        final MappingIterator<T> readValues = mapper.reader(type).with(bootstrapSchema).readValues(file);
        return readValues.readAll();
    }
}
