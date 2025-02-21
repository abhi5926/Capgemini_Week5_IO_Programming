package advancedproblemtesting.ValidateCSVDataBeforeProcessingTesting;

import com.io.advanceproblem.ValidateCSVDataBeforeProcessing.CSVValidator;
import org.junit.jupiter.api.Test;

public class ValidateCSVData {
    @Test
    public void validateCSV(){
        // Creating String that Contain File Path
        String csvFile = "D:\\Capgemini Notes\\CSVValidator.csv";

        // Creating Class Object
        CSVValidator ob = new CSVValidator();

        // Method calling
        ob.validator(csvFile);
    }
}
