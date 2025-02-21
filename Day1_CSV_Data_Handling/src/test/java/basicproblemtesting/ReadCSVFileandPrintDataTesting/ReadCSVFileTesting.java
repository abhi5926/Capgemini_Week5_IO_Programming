package basicproblemtesting.ReadCSVFileandPrintDataTesting;

import com.io.basicproblem.ReadaCSVFileandPrintData.ReadCSV;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReadCSVFileTesting {
    @Test
    public void readCSVTest(){
        // Creating Class Object
        ReadCSV ob = new ReadCSV();

        // String Contains FilePath
        String filePath = "D:\\Capgemini Notes\\CSVFILE.csv";

        // Method calling
        ob.readCSV(filePath);
    }
}
