package com.io.HandsOnPracticeProblem.ConvertJSONtoXMLFormatTesting;

import com.io.HandsOnPracticeProblem.ConvertJSONtoXMLFormat.ConvertJSONtoXML;
import org.junit.jupiter.api.Test;

public class JSONtoXMLFormat {
    @Test
    void convertJSONToXML(){
        // Creating String to Store file Path
        String filePath ="D:\\Capgemini Notes\\JSONFile\\file2.json";

        // Creating class Object
        ConvertJSONtoXML ob = new ConvertJSONtoXML();
        // Calling Method
        ob.convertJSONtoXML(filePath);
    }
}
