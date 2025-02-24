package com.io.PracticeProblem.ParseJSONandFilterOnlyThoseRecordsWhereAgeIsGreaterThan25;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeType;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
