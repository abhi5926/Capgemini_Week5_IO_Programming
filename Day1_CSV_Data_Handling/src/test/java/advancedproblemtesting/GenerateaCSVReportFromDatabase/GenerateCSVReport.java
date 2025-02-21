package advancedproblemtesting.GenerateaCSVReportFromDatabase;

import com.io.advanceproblem.GenerateaCSVReportFromDatabase.CSVReportFromDatabase;
import org.junit.jupiter.api.Test;

public class GenerateCSVReport {
    @Test
    public void generateCSVReport(){
        // Specify the path to save the CSV file
        String csvFile = "D:\\Capgemini Notes\\StudentRecord.csv"; // Change path as required
        // Creating class Object
        CSVReportFromDatabase ob = new CSVReportFromDatabase();
        ob.generateCSV(csvFile);
    }
}
