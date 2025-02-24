package com.io.HandsOnPracticeProblem.ConvertCSVDataIntoJSONTesting;

import com.io.HandsOnPracticeProblem.ConvertCSVDataIntoJSON.CsvToJsonConverter;
import org.junit.jupiter.api.Test;

public class ConvertCSVtoJSON {
    @Test
   void converterTesting(){
        // Creating class Object
        CsvToJsonConverter ob = new CsvToJsonConverter();

        // Creating String to Store File Path
        String CSVFilePath ="D:\\Capgemini Notes\\Employee.csv";

        // Method calling
        ob.converter(CSVFilePath);
    }
}
