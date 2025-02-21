package com.io.intermediateproblem.FilterRecordsFromCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudentRecord {
    // Method to filter Record By Students Marks
    public void filterStudentsByMarks(String filePath){
     try{
         // FileReader Object
         FileReader fr = new FileReader(filePath);
         // Creating Buffered Reader class Object
         BufferedReader br = new BufferedReader(fr);
         String line;
         while((line = br.readLine()) != null){
             String[] columns = line.split(",");
             String id = columns[0];
             String name = columns[1];
             String age = columns[2];
             String marks = columns[3];
       try {
           int mark = Integer.parseInt(marks);
           if (mark > 80) {
               System.out.println("ID :" + id + " Name :" + name + " Age :" + age + "Marks :" + marks);
           }else{
               continue;
           }
       }catch(NumberFormatException k){

       }
         }
     }catch(IOException e){
         e.printStackTrace();
     }
    }
    public static void main(String[] args) {
      // Creating String that Contains CSV file path
        String filePath ="D:\\Capgemini Notes\\StudentRecord.csv";

        // Creating class Object
        FilterStudentRecord ob = new FilterStudentRecord();

        // Calling Method
        ob.filterStudentsByMarks(filePath);
    }
}
