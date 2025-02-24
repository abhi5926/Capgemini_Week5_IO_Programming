package com.io.HandsOnPracticeProblem.ValidateanEmailFieldUsingJSONSchema;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.io.IOException;

public class ValidateEmail {

    public static void main(String[] args) {
        // Define the JSON Schema
        String schemaStr = """
        {
          "$schema": "http://json-schema.org/draft-07/schema#",
          "type": "object",
          "properties": {
            "email": {
              "type": "string",
              "format": "email"
            }
          },
          "required": ["email"]
        }
        """;

        // Create the JSON Schema object
        JSONObject jsonSchema = new JSONObject(new JSONTokener(schemaStr));
        Schema schema = SchemaLoader.load(jsonSchema);

        // Read JSON data from file
        String jsonFilePath = "D:\\Capgemini Notes\\JSONFile\\FilterJSON.json";
        try (FileReader reader = new FileReader(jsonFilePath)) {
            JSONObject jsonObject = new JSONObject(new JSONTokener(reader));

            // Validate the JSON object against the schema
            try {
                schema.validate(jsonObject);
                System.out.println("Valid email");
            } catch (Exception e) {
                System.out.println("Invalid email: " + e.getMessage());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

