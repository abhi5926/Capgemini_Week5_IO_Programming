package com.io.HandsOnPracticeProblem.MergeTwoJSONFilesIntoaSingleJSONObject;

import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.FileReader;

public class MergeJSONFile {
    // Method to merge two JSON files
    public static void mergeJSONFile(String file1, String file2) {
        try {
            // Read JSON data from the first file
            FileReader fr1 = new FileReader(file1);
            JSONObject jsonObject1 = new JSONObject(new JSONTokener(fr1));

            // Read JSON data from the second file
            FileReader fr2 = new FileReader(file2);
            JSONObject jsonObject2 = new JSONObject(new JSONTokener(fr2));

            // Merge the two JSON objects
            for (String key : jsonObject2.keySet()) {
                if (jsonObject1.has(key) && jsonObject1.get(key) instanceof JSONObject) {
                    mergeJSONObjects(jsonObject1.getJSONObject(key), jsonObject2.getJSONObject(key));
                } else {
                    jsonObject1.put(key, jsonObject2.get(key));
                }
            }

            // Display merged JSON object
            System.out.println(jsonObject1.toString(4));  // Using 4 for pretty printing

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Recursive method to merge two nested JSON objects
    private static void mergeJSONObjects(JSONObject jsonObject1, JSONObject jsonObject2) {
        for (String key : jsonObject2.keySet()) {
            if (jsonObject1.has(key) && jsonObject1.get(key) instanceof JSONObject) {
                mergeJSONObjects(jsonObject1.getJSONObject(key), jsonObject2.getJSONObject(key));
            } else {
                jsonObject1.put(key, jsonObject2.get(key));
            }
        }
    }

    // Main method to test merging
    public static void main(String[] args) {
        // File paths for the JSON files
        String file1 = "D:\\Capgemini Notes\\JSONFile\\file1.json";
        String file2 = "D:\\Capgemini Notes\\JSONFile\\file2.json";

        // Calling method to merge the files
        mergeJSONFile(file1, file2);
    }
}
