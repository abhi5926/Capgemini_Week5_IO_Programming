package com.io.advanceproblem.ConvertJSONtoCSVandVIceVersa;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertJSONTOCSV {
        // Convert JSON to CSV
        public static void jsonToCSV(String jsonFile, String csvFile) {
            try {
                // Create ObjectMapper to read JSON
                ObjectMapper objectMapper = new ObjectMapper();
                // Read JSON file as List of Map
                List<Map<String, Object>> students = objectMapper.readValue(new File(jsonFile), List.class);

                // Create CSVWriter to write to CSV file
                CSVWriter csvWriter = new CSVWriter(new FileWriter(csvFile));

                // Write the header row
                if (!students.isEmpty()) {
                    List<String> headers = new ArrayList<>(students.get(0).keySet());
                    csvWriter.writeNext(headers.toArray(new String[0]));

                    // Write the student data rows
                    for (Map<String, Object> student : students) {
                        List<String> data = new ArrayList<>();
                        for (String key : headers) {
                            data.add(student.get(key).toString());
                        }
                        csvWriter.writeNext(data.toArray(new String[0]));
                    }
                }

                csvWriter.close();
                System.out.println("CSV file generated successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Convert CSV to JSON
        public static void csvToJSON(String csvFile, String jsonFile) {
            try {
                // Create BufferedReader to read the CSV file
                BufferedReader csvReader = new BufferedReader(new FileReader(csvFile));
                String row;
                List<Map<String, String>> students = new ArrayList<>();

                // Read headers
                String[] headers = csvReader.readLine().split(",");

                // Read and process each row
                while ((row = csvReader.readLine()) != null) {
                    String[] data = row.split(",");
                    Map<String, String> student = new HashMap<>();
                    for (int i = 0; i < headers.length; i++) {
                        student.put(headers[i], data[i]);
                    }
                    students.add(student);
                }

                // Create ObjectMapper to write JSON
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(jsonFile), students);

                csvReader.close();
                System.out.println("JSON file generated successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            // Example file paths - Ensure these paths exist on your system
            String jsonFile = "D:\\Capgemini Notes\\StudentJSONFile.json";
            String csvFile = "D:\\Capgemini Notes\\ConvertingJSONToCSV.csv";

            // Convert JSON to CSV
            jsonToCSV(jsonFile, csvFile);

            // Convert CSV back to JSON
            csvToJSON(csvFile, "D:\\Capgemini Notes\\ConvertingCSVToJSON.json");
        }
    }


