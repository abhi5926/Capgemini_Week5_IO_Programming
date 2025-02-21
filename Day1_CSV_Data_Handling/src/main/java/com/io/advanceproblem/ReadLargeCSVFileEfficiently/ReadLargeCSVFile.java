package com.io.advanceproblem.ReadLargeCSVFileEfficiently;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSVFile {
    public static void processCSV(String csvFile) {
        String line;
        int batchSize = 100;
        int count = 0;

        // Read the large CSV file
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            List<String> batch = new ArrayList<>(batchSize);
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                batch.add(line);

                // When batch size reaches 100, process the batch
                if (batch.size() == batchSize) {
                    processBatch(batch);
                    batch.clear();
                    count += batchSize;
                    System.out.println("Processed " + count + " records so far.");
                }
            }

            // Process any remaining lines
            if (!batch.isEmpty()) {
                processBatch(batch);
                count += batch.size();
                System.out.println("Processed " + count + " records so far.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void processBatch(List<String> batch) {
        for (String line : batch) {
            System.out.println(line);
        }
    }
    public static void main(String[] args) {
        // Creating String that Contain File Path
        String filePath = "D:\\Capgemini Notes\\StudentRecord.csv";
        // Method calling
        processCSV(filePath);
    }
}

