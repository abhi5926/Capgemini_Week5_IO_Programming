package com.io.HandsOnPracticeProblem.ConvertCSVDataIntoJSON;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvToJsonConverter {
    // Creating Method
    public static void converter(String CSVFilePath){
        try{
            String line;
            // Creating FileReader class Object
            FileReader fr = new FileReader(CSVFilePath);
            // Creating BufferedReader class Object
            BufferedReader br = new BufferedReader(fr);

            JSONArray jsonArray = new JSONArray();
            // Splitting header with comma
            String[] header = br.readLine().split(",");

            // Read the Line from the file
            while((line = br.readLine()) != null){
                String[] values = line.split(",");

                // Creating JSONObject
                JSONObject obj = new JSONObject();

                for(int i=0;i<header.length;i++){
                    obj.put(header[i],values[i]);
                }
                jsonArray.put(obj);
            }

            // Output JSON array
            System.out.println(jsonArray.toString());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {
        // Creating String to Store File Path
        String CSVFilePath ="D:\\Capgemini Notes\\Employee.csv";

        // Method calling
        converter(CSVFilePath);
    }
}
