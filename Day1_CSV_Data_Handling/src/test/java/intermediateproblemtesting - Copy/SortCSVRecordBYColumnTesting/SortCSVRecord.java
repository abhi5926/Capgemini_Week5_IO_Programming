package intermediateproblemtesting.SortCSVRecordBYColumnTesting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.io.intermediateproblem.SortCSVRecordByColumn.SortCSVRecord.printTop5HighestPaidEmployees;
import static com.io.intermediateproblem.SortCSVRecordByColumn.SortCSVRecord.readCSV;

public class SortCSVRecord {
    @Test
    public void sortCSV(){
        // Creating String
        String csvFile = "D:\\Capgemini Notes\\Employee.csv";

        // Method calling
        List<com.io.intermediateproblem.SortCSVRecordByColumn.SortCSVRecord.Employee> employees = readCSV(csvFile);
        System.out.println("Top 5 highest-paid employees:");
        printTop5HighestPaidEmployees(employees);
    }

}
