package basicproblemtesting.WriteDatatoaCSVFileTesting;

import com.io.basicproblem.WriteDatatoCSVFile.WriteToCSVFile;
import org.junit.jupiter.api.Test;

public class WriteDataToCSVFileTesting {
    @Test
    public void writeDataToCSVFileTest(){
        // Creating Class Object
        WriteToCSVFile ob = new WriteToCSVFile();

        // Creating String to Store FilePath
        String filePath = "D:\\Capgemini Notes\\CSVFileWriting.csv";

        // Method calling
        ob.writeToFile(filePath);
    }
}
