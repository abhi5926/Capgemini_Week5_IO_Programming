package com.io.PracticeProblem.CreateaJSONObjectforaStudent;

import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
public class CreateJSONObject {
    public static void createJSONObject(){
        // Creating JSONArray to store Subjects
        JSONArray subject = new JSONArray();
        subject.put("Physics");
        subject.put("Chemistry");
        subject.put("Meths");
// Creating JSONObject to store Student records
        JSONObject student = new JSONObject();
        student.put("name","Abhishek");
        student.put("age",22);
        student.put("Subjcts",subject);

        // Display Student Record
        System.out.println(student.toString(4));
    }
   // Main Method
    public static void main(String[] args) {
        // Method calling
        createJSONObject();
    }
}
