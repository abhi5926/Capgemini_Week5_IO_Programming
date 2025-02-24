package com.io.PracticeProblem.ConvertaJavaObjectIntoJSONFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class JavaObjectToJSONFormat {
    public static void objectToJSON() {
        try {
            // Creating Object of ObjectMapper class
            ObjectMapper objectMapper = new ObjectMapper();

            // Creating Object of Car class
            Car car = new Car("alto800", "Abhishek", "MP39CX8890");

            // Converting Java Object to JSON String
            String jsonString = objectMapper.writeValueAsString(car);
            // Display Details
            System.out.println(jsonString);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Method calling
        objectToJSON();
    }
}
