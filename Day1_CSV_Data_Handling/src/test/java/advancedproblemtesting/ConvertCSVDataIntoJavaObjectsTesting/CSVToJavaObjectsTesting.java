package advancedproblemtesting.ConvertCSVDataIntoJavaObjectsTesting;

import com.io.advanceproblem.ConvertCSVDataIntoJavaObjects.CSVReader;
import org.junit.jupiter.api.Test;

public class CSVToJavaObjectsTesting {
    @Test
    public void csvToJavaObjectTesting(){
        // Creating String
        String filePath = "D:\\Capgemini Notes\\StudentRecord.csv";

         // Creating class Object
        CSVReader ob = new CSVReader();

        // Method calling
        ob. csvRead(filePath);
    }
}
