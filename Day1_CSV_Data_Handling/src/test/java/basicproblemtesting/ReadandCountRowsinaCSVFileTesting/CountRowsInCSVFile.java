package basicproblemtesting.ReadandCountRowsinaCSVFileTesting;

import com.io.basicproblem.ReadandCountRowsInaCSVFile.CountRowsInCSV;
import org.junit.jupiter.api.Test;

public class CountRowsInCSVFile {
    @Test
    public void countRowsTesting(){
        // Creating String that Contain File Path
        String filePath = "D:\\Capgemini Notes\\CSVFileWriting.csv";

        // Creating class Object
        CountRowsInCSV ob = new CountRowsInCSV();
        ob.countRows(filePath);

        // Calling

    }
}
