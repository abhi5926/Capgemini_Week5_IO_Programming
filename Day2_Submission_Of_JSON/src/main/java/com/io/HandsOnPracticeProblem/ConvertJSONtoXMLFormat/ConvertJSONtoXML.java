package com.io.HandsOnPracticeProblem.ConvertJSONtoXMLFormat;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.XML;

import java.io.FileReader;
import java.io.IOException;

public class ConvertJSONtoXML {
    public static void convertJSONtoXML(String filePath) {
        try {
            // Read JSON data from file
            FileReader reader = new FileReader(filePath);
            JSONObject jsonObject = new JSONObject(new JSONTokener(reader));

            // Convert JSON to XML
            String xml = XML.toString(jsonObject);

            // Display the XML
            System.out.println(xml);

        } catch (IOException e) {
            System.out.println("Error reading JSON file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Creating String to Store file Path
        String filePath ="D:\\Capgemini Notes\\JSONFile\\file2.json";

        // Calling Method
        convertJSONtoXML(filePath);
    }
}
