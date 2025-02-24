package com.io.PracticeProblem.ReadaJSONFileandExtractOnlySpecificFields;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

public class ReadJSONFile  {
    public  void readJSONFile(String filePath){
        try {
            // Creating FileInputStream and InputStreamReader with UTF-8 encoding
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

            // Creating ObjectMapper class Object
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(inputStreamReader);

            // Running loop
            for (JsonNode node : jsonNode) {
                String name = node.get("Name").asText();
                String email = node.get("Email").asText();
                System.out.println("Student Email and Name :");
                System.out.println("Student Name is :" + name);
                System.out.println("Student Email is :" + email);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        // Creating String
       String filePath = "D:\\Capgemini Notes\\JSONFile\\ReadData.json";

       // Creating class Object
        ReadJSONFile ob = new ReadJSONFile();
      //Method calling
        ob.readJSONFile(filePath);
    }
}
