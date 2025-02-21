package com.io.basicproblem.WriteDatatoCSVFile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToCSVFile {
    public void writeToFile(String filePath){
        try{
            // Creating Object of File Reader and File Writer
            FileWriter fr = new FileWriter(filePath);
            BufferedWriter br = new BufferedWriter(fr);

             // Writing Content on file
            br.write("RollNumber,Name,Department,Salary\n");
            br.write("12,Abhishek,Computer Science,100000\n");
            br.write("13,Neeraj,Civil,20000\n");
            br.write("14,Rajan,Mechanicle,12000\n");
            br.write("15,Sachin,Electrical,80000\n");
            br.write("16,Vasu,Computer Science,40000\n");

            br.close();
            // Display Message After Writing Data on File
            System.out.println("Data Written Successfully on CSV File :");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // String that Contain File Path
        String filePath = "D:\\Capgemini Notes\\CSVFileWriting.csv";

        // Creating class Object
        WriteToCSVFile ob = new WriteToCSVFile();

        // Method calling
        ob.writeToFile(filePath);
    }
}
