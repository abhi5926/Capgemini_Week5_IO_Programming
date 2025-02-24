package com.io.HandsOnPracticeProblem.ConvertaListofJavaObjectsintoaJSONarray;

import com.io.PracticeProblem.ConvertaListofJavaObjectsIntoaJSONArray.ConvertListToJSONArray;
import com.io.PracticeProblem.ConvertaListofJavaObjectsIntoaJSONArray.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ConvertListOfJavaObjectInJSONArrayTesting {
    @Test
    void convertListToJsonArray(){
        // Creating class Object
        ConvertListToJSONArray ob = new ConvertListToJSONArray();

        // Creating list
        List<Student> Students = new ArrayList<>();

        // Adding Objects in Student List
        Students.add(new Student("Abhishek",22,"Computer Science"));
        Students.add(new Student("Neeraj",19,"Civil"));
        Students.add(new Student("Rajan",21,"Data Science"));

        // Calling Method
        ob.convertListToJsonArray(Students);
    }
}
