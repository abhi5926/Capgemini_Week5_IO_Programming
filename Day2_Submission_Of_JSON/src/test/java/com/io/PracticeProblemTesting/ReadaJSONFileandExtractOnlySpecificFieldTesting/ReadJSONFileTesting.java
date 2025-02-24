package com.io.PracticeProblemTesting.ReadaJSONFileandExtractOnlySpecificFieldTesting;

import com.io.PracticeProblem.ReadaJSONFileandExtractOnlySpecificFields.ReadJSONFile;
import org.junit.jupiter.api.Test;

public class ReadJSONFileTesting {
      @Test
    void readJSONFILEExtractInformation(){
          // Creating class Object
          ReadJSONFile ob = new ReadJSONFile();

          // Creating String that Contain FilePath
          String filePath = "D:\\Capgemini Notes\\JSONFile\\ReadData.json";

          // Calling Method
          ob.readJSONFile(filePath);
      }
}
