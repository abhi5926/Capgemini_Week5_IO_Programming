package com.io.PracticeProblemTesting.MergeTwoJSONObjectTesting;

import com.io.PracticeProblem.MergeTwoJSONObjectsIntoOne.MergeTwoJSONObject;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static com.io.PracticeProblem.MergeTwoJSONObjectsIntoOne.MergeTwoJSONObject.mergeJSONObject;

public class MergeTwoJSONObjectTesting {
    @Test
    void mergeTwoJSONObject(){
        // Creating class Object
        MergeTwoJSONObject ob = new MergeTwoJSONObject();
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

        mergeJSONObject(jsonObject1,jsonObject2);
    }
}
