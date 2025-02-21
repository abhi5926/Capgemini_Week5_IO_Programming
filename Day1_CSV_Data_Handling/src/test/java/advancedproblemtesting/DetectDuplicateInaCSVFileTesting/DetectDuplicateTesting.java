package advancedproblemtesting.DetectDuplicateInaCSVFileTesting;

import com.io.advanceproblem.DetectDuplicatesInaCSVFile.DetectDuplicates;
import org.junit.jupiter.api.Test;

public class DetectDuplicateTesting {
    @Test
    public void detectDuplicate(){
        // Creating String that Store File Path
        String csvFile =  "D:\\Capgemini Notes\\Student1.csv";

        // Creating Class Object
        DetectDuplicates ob = new DetectDuplicates();

        // Method calling
        ob.detectDuplicates(csvFile);
    }
}
