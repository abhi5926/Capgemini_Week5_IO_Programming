package intermediateproblemtesting.FilterRecordFromCSVTesting;

import com.io.intermediateproblem.FilterRecordsFromCSV.FilterStudentRecord;
import org.junit.jupiter.api.Test;

public class FilterRecord {
    @Test
    public void filterRecord(){
        // Creating class Object
        FilterStudentRecord ob = new FilterStudentRecord();

        // Creating String that will Contain file path
        String filePath = "D:\\Capgemini Notes\\StudentRecord.csv";

        // Method calling
        ob.filterStudentsByMarks(filePath);
    }
}
