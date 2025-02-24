package com.io.PracticeProblemTesting.CreateJavaObjectToJsonFormatTesting;

import com.io.PracticeProblem.ConvertaJavaObjectIntoJSONFormat.JavaObjectToJSONFormat;
import org.junit.jupiter.api.Test;

public class JavaObjectToJSONFormatTesting {
    @Test
    void objectToJSONFormatTesting(){
        // Creating class Object
        JavaObjectToJSONFormat ob = new JavaObjectToJSONFormat();
        // Method calling
        ob.objectToJSON();

    }
}
