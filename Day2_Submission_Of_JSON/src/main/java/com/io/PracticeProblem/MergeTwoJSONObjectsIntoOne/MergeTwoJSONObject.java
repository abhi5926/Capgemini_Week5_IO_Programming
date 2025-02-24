package com.io.PracticeProblem.MergeTwoJSONObjectsIntoOne;
import org.json.JSONObject;
public class MergeTwoJSONObject {
    // Method to merge Two JSON Object
    public static void mergeJSONObject(JSONObject jsonObject1,JSONObject jsonObject2){
        // Running loop to merge JSON Objects
      for(String key : jsonObject2.keySet()){
          jsonObject1.put(key,jsonObject2.get(key));
      }
        System.out.println(jsonObject1);
    }
    public static void main(String[] args) {
        // Creating JSON Object first
        JSONObject jsonObject1 = new JSONObject();

        // Adding Data in jsonObject1
        jsonObject1.put("name","Abhishek");
        jsonObject1.put("age",15);

        // Creating JSON Object Second
        JSONObject jsonObject2 = new JSONObject();

        // Adding Data in jsonObject1
        jsonObject2.put("name","Sachin");
        jsonObject2.put("Bhopal","India");

        // Method to merge two JSON Objects
        mergeJSONObject(jsonObject1,jsonObject2);
    }
}
