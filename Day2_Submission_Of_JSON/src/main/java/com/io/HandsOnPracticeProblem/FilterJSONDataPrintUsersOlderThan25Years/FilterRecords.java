package com.io.HandsOnPracticeProblem.FilterJSONDataPrintUsersOlderThan25Years;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class FilterRecords {
    public static void fileterRecords(String filePath){
        try{
            // Creating file class Object
            File file = new File(filePath);

            // Creating ObjectMaper Class Object
            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode jsonNode = objectMapper.readTree(file);

            // running for each loop
            for(JsonNode node : jsonNode){
                int newage = node.get("Age").asInt();
                if(newage > 25){
                    System.out.println(node);
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Creating String that Contain File Path
        String filePath = "D:\\Capgemini Notes\\JSONFile\\FilterJSON.json";

        // Calling Method
        fileterRecords(filePath);
    }
}
