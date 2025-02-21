package com.io.intermediateproblem.ModifyaCSVFile;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyCSV {
    public static void modify(String inputFilePath,String outputFilePath){
      try{
          // FileReader Object for input CSV file
          FileReader fr = new FileReader(inputFilePath);
          BufferedReader br = new BufferedReader(fr);

          // FileWriter Object for output CSV file
          FileWriter fw = new FileWriter(outputFilePath);
          BufferedWriter bw = new BufferedWriter(fw);

          // Read and write the header if present
          String header = br.readLine();
          bw.write(header);
          bw.newLine();

          String line;

          String departmentName = "IT";
          while((line = br.readLine()) != null) {
              String[] column = line.split(",");
              String id = column[0];
              String name = column[1];
              String department = column[2];
              double salary = Double.parseDouble(column[3]);

              // Check if condition true
              if (departmentName.equals(department)) {
                  salary = salary * 1.10;
              }


              // Creating the updataed Line
              String updatedLine = id + "," + name + "," + department + "," + salary;

              // Write the updated line to the output file
              bw.write(updatedLine);
              bw.newLine();
          }
              System.out.println("File Updated Successfully :");

      }catch(IOException e){
          e.printStackTrace();
      }
    }
    public static void main(String[] args) {
        // Creating String that contains file path
        String inputFilePath  = "D:\\Capgemini Notes\\CSVFileWriting.csv";
        String outputFilePath = "D:\\Capgemini Notes\\OutputCSVFile.csv";

        // Calling Method
        modify(inputFilePath,outputFilePath);
    }
}