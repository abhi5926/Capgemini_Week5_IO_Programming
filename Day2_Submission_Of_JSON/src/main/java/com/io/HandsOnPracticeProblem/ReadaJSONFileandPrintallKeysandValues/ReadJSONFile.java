package com.io.HandsOnPracticeProblem.ReadaJSONFileandPrintallKeysandValues;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJSONFile {
        public static void printJSONData(String filePath){
            try{
                // Creating file class Object
                File file = new File(filePath);

                // Creating ObjectMapper class Object
                ObjectMapper objectMapper = new ObjectMapper();

                JsonNode jsonNode = objectMapper.readTree(file);

                for(JsonNode node : jsonNode){
                    System.out.println(node);
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        public static void main(String[] args) {
            // Creating String that Contains file Path
            String filePath = "D:\\Capgemini Notes\\JSONFile\\FilterJSON.json";

            // Method calling
            printJSONData(filePath);
        }
}
