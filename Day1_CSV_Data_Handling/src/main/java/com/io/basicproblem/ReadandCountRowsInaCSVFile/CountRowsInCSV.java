package com.io.basicproblem.ReadandCountRowsInaCSVFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountRowsInCSV {
    // Creating Method to Count number of Rows
    public void countRows(String filePath){
        try{
            // Creating fileReader Object
            FileReader fr = new FileReader(filePath);

            // Creating BufferedReader Object
            BufferedReader br = new BufferedReader(fr);

            // Creating Variable to Store Number of Rows
            int rows = 0;
            while((br.readLine()) != null){
                rows++;
            }
            // Display Number of Records Available in File
            System.out.println("Number of Rows in a CSV File is :"+(rows-1));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // String that Contain File Path
        String filePath = "D:\\Capgemini Notes\\CSVFileWriting.csv";

        // Creating Class Object
        CountRowsInCSV ob = new CountRowsInCSV();

        // Calling Method
        ob.countRows(filePath);
    }
}
