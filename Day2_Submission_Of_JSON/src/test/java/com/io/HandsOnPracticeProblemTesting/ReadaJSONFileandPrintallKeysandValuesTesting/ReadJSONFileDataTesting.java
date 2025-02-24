package com.io.HandsOnPracticeProblem.ReadaJSONFileandPrintallKeysandValuesTesting;

import com.io.PracticeProblem.ReadaJSONFileandExtractOnlySpecificFields.ReadJSONFile;
import org.junit.jupiter.api.Test;

public class ReadJSONFileDataTesting {
    @Test
    void readJSONFileData(){
        // Creating String that Contains file Path
        String filePath = "D:\\Capgemini Notes\\JSONFile\\FilterJSON.json";

        // Creating class Object
        ReadJSONFile ob = new ReadJSONFile();
        // Method calling
        ob.readJSONFile(filePath);
    }
}
