package com.io.advanceproblem.MergeTwoCSVFiles;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoCSV {
    public static void mergeCSV(String file1, String file2, String outputFile){
        Map<String, String[]> students1Data = new HashMap<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            // Skip header line
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                String id = columns[0];
                String name = columns[1];
                String age = columns[2];
                String marks = columns[3];

                students1Data.put(id, new String[] {name, age,marks});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Merge with students2.csv and write to a new file
        try (BufferedReader br = new BufferedReader(new FileReader(file2));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            // Write header for the output file
            bw.write("ID,Name,Age,Marks,Grade\n");

            // Skip header of second CSV file
            br.readLine();

            // Read students2.csv and merge data
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                String id = columns[0];
                String name = columns[1];
                String age = columns[2];
                String marks = columns[3];

                // If the ID is present in students1Data, merge the data
                if (students1Data.containsKey(id)) {
                    String[] student1Info = students1Data.get(id);
                    String  sname = student1Info[0];
                    String sage = student1Info[1];

                    // Write merged data to the output file
                    bw.write(id + "," + name + "," + age + "," + marks + ","  + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // Creating String to Store File Path
        String students1File = "D:\\Capgemini Notes\\Student1.csv";
        String students2File = "D:\\Capgemini Notes\\Student2.csv";
        String outputFile = "D:\\Capgemini Notes\\OutputCSVFile.csv";
        // Call the merge method
        mergeCSV(students1File, students2File, outputFile);

        System.out.println("CSV files merged successfully into: " + outputFile);

    }
}
