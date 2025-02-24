package com.io.HandsOnPracticeProblem.ConvertaListofJavaObjectsIntoaJSONArray;
import com.google.gson.Gson;
import com.io.PracticeProblem.ConvertaListofJavaObjectsIntoaJSONArray.Student;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToJSONArray {
    // Creating Method to Convert List to Gson Array
    public static void convertListToJsonArray( List<Student> Students){
        // Creating Gson class Object
        Gson gson = new Gson();
        // Converting list to Json Array
        String gsonArray = gson.toJson(Students);

        // Display Gson Array
        System.out.println(gsonArray);
    }
    public static void main(String[] args) {
        // Creating list
        List<Student> Students = new ArrayList<>();

        // Adding Objects in Student List
        Students.add(new Student("Abhishek",22,"Computer Science"));
        Students.add(new Student("Neeraj",19,"Civil"));
        Students.add(new Student("Rajan",21,"Data Science"));

        // Calling Method
        convertListToJsonArray( Students);
    }
}

