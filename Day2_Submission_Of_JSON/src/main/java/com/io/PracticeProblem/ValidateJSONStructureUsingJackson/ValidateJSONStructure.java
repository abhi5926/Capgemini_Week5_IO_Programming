package com.io.PracticeProblem.ValidateJSONStructureUsingJackson;
/*
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.ValidationMessage;

import java.io.File;
import java.io.IOException;
import java.util.Set;
public class ValidateJSONStructure {


    public class JacksonJsonValidation {

        public static void main(String[] args) {
            String schemaFilePath = "D:\\Capgemini Notes\\JSONFile\\file1.json";
            String jsonFilePath = "D:\\Capgemini Notes\\JSONFile\\FilterJSON.json";

            ObjectMapper objectMapper = new ObjectMapper();

            try {
                // Load and parse the JSON schema
                JsonNode schemaNode = objectMapper.readTree(new File(schemaFilePath));
                JsonSchemaFactory schemaFactory = JsonSchemaFactory.getInstance();
                JsonSchema schema = schemaFactory.getSchema(schemaNode);

                // Load and parse the JSON data
                JsonNode jsonNode = objectMapper.readTree(new File(jsonFilePath));

                // Validate the JSON data against the schema
                Set<ValidationMessage> validationMessages = schema.validate(jsonNode);

                if (validationMessages.isEmpty()) {
                    System.out.println("JSON is valid.");
                } else {
                    System.out.println("JSON is invalid:");
                    for (ValidationMessage message : validationMessages) {
                        System.out.println(message.getMessage());
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
*/