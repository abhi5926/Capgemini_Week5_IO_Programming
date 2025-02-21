package com.io.basicproblem.ReadaCSVFileandPrintData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadCSV {
    public void readCSV(String filePath){
    try{
        // Creating Object of BufferedReader and FileReader
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        // Creating String that Store and Print data Line by Line from File
        String line;
        while((line = br.readLine()) != null){
            // Creating Array of Type String
            String[] columns = line.split(",");
            // Display Data
            System.out.println("Student ID :"+columns[0] +" Name :"+columns[1]+" Age :"+columns[2]+" Marks :"+columns[3]);
        }

    }catch(IOException e){
        e.printStackTrace();
    }
    }
    public static void main(String[] args) {
        // Creating String that contain FilePath
        String filePath = "D:\\Capgemini Notes\\CSVFILE.csv";

        // Creating Class Object
        ReadCSV ob = new ReadCSV();

        // Method calling
        ob.readCSV(filePath);
    }
}
