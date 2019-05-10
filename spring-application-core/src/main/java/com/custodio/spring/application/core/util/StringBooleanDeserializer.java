package com.custodio.spring.application.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * Class responsible for converting an numeric to boolean.
 *
 * @author wcustodio.
 */
public class StringBooleanDeserializer extends JsonDeserializer<Boolean> {

    @Override
    public Boolean deserialize( JsonParser parser, DeserializationContext context) throws IOException {
        return !"no".equalsIgnoreCase(parser.getText());
    }
}
