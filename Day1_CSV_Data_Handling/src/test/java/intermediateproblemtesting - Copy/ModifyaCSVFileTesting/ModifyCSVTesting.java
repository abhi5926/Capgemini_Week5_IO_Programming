package intermediateproblemtesting.ModifyaCSVFileTesting;

import com.io.intermediateproblem.ModifyaCSVFile.ModifyCSV;
import org.junit.jupiter.api.Test;

public class ModifyCSVTesting {
    @Test
    public void modifyCSVTesting(){
        // Creating Class Object
        ModifyCSV ob = new ModifyCSV();

        // Creating String that contains file path
        String inputFilePath  = "D:\\Capgemini Notes\\CSVFileWriting.csv";
        String outputFilePath = "D:\\Capgemini Notes\\OutputCSVFile.csv";

        // Method calling
        ob.modify(inputFilePath,outputFilePath);

    }
}
