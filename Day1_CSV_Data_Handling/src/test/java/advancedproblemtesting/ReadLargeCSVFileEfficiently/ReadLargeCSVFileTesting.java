package advancedproblemtesting.ReadLargeCSVFileEfficiently;


import com.io.advanceproblem.ReadLargeCSVFileEfficiently.ReadLargeCSVFile;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSVFileTesting {

        @Test
    public void readLargeCSV(){
            // Creating String that Contain File Path
            String filePath = "D:\\Capgemini Notes\\StudentRecord.csv";

            // Creating class Object
            ReadLargeCSVFile ob = new ReadLargeCSVFile();
            // Method calling
            ob.processCSV(filePath);
        }

}
