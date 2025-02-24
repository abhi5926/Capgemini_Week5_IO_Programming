package com.io.PracticeProblemTesting.ParseJSONandFilterRecordsTesting;

import com.io.PracticeProblem.ParseJSONandFilterOnlyThoseRecordsWhereAgeIsGreaterThan25.FilterRecords;
import org.junit.jupiter.api.Test;

public class FilterRecordsTesting {
    @Test
    public void filterRecords(){
        // Creating String that will contain file Path
        String filePath = "D:\\Capgemini Notes\\JSONFile\\FilterJSON.json";

        // Creating class Object
        FilterRecords ob = new FilterRecords();

        // Method calling
        ob.fileterRecords(filePath);
    }
}
