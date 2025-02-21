package com.io.advanceproblem.DetectDuplicatesInaCSVFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DetectDuplicates {

        public static void detectDuplicates(String csvFile) {
            String line;


            // Set to store unique IDs
            Set<String> seenIDs = new HashSet<>();
            // List to store duplicate records
            List<String> duplicateRecords = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

                br.readLine();

                // Read each line in the CSV file
                while ((line = br.readLine()) != null) {
                    String[] columns = line.split(",");
                    String id = columns[0];

                    // Check if the ID has been seen before
                    if (seenIDs.contains(id)) {
                        // If ID is duplicate, add the whole line to duplicateRecords list
                        duplicateRecords.add(line);
                    } else {
                        // If ID is not duplicate
                        seenIDs.add(id);
                    }
                }

                // Print the duplicate records
                if (duplicateRecords.isEmpty()) {
                    System.out.println("No duplicate records found.");
                } else {
                    System.out.println("Duplicate records based on ID:");
                    for (String duplicate : duplicateRecords) {
                        System.out.println(duplicate);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            String csvFile =  "D:\\Capgemini Notes\\Student1.csv";

            // Detect duplicates in the CSV file
            detectDuplicates(csvFile);
        }
    }


