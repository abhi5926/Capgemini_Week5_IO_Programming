package com.io.intermediateproblem.SearchForaRecordInCSV;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchRecordInCSV {
    public static void searchRecord(String filePath) {
        try {
            // FileReader Object
            FileReader fr = new FileReader(filePath);

            // Creating Buffered Reader class Object
            BufferedReader br = new BufferedReader(fr);

            // Taking Emplyee Name to be search
            String emp_Name = "Abhishek";
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                String id = columns[0];
                String name = columns[1];
                String age = columns[2];
                String marks = columns[3];

                if (name.equals(emp_Name)) {
                    System.out.println("ID :" + id + " Name :" + name + " Age :" + age + "Marks :" + marks);
                    break;
                }else{
                    continue;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Creating String that will Contain File Path
        String filePath = "D:\\Capgemini Notes\\CSVFileWriting.csv";

        // Calling Method
        searchRecord(filePath);
    }
}
