package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Utility class for JSON operations.
 */
public class JsonUtils {

    // ObjectMapper instance for JSON operations
    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private JsonUtils() {
    }

    /**
     * Convert an object to its JSON representation.
     *
     * @param object The object to be converted.
     * @return The JSON string representation of the object.
     * @throws RuntimeException if there's an error during conversion.
     */
    public static String asJson(Object object) {
        try {
            // Convert object to pretty-printed JSON string
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);

            // Write the JSON representation of the object to a file named 'electric.json'
            objectMapper.writeValue(new File("electric.json"), object);

            return jsonString;
        } catch (IOException e) {
            // Throw a runtime exception if there's an error during conversion
            throw new RuntimeException(e);
        }
    }
}