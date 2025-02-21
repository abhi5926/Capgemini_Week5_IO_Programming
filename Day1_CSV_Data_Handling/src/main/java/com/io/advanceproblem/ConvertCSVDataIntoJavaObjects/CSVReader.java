package com.io.advanceproblem.ConvertCSVDataIntoJavaObjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    // Method to read record and convert it into objects
    public static List<Student> csvRead(String filePath){
        List<Student> students = new ArrayList<>();
        String line;
        try{
            // Creating Filereader And BufferedReader Object
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            // Skip header
            br.readLine();

            // Read each line in the CSV file
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");

                String id = columns[0];
                String name = columns[1];
                String age = columns[2];
                String marks = columns[3];

                Student student = new Student(id, name, age, marks);
                students.add(student);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
            return students;
    }
    public static void main(String[] args) {
        // Creating String to store filePath
      String filePath = "D:\\Capgemini Notes\\StudentRecord.csv";


        // Get the list of students by reading the CSV
        List<Student> students =  csvRead(filePath);

        // Print out the list of students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
