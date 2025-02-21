package intermediateproblemtesting.SearchForaRecordInCSVTesting;

import com.io.intermediateproblem.SearchForaRecordInCSV.SearchRecordInCSV;
import org.junit.jupiter.api.Test;

public class SearchRecordTesting {
    @Test
    public void searchRecorsTesting(){
        // Creating String that Contain filePath
        String filePath = "D:\\Capgemini Notes\\CSVFileWriting.csv";

        // Creating class Object
        SearchRecordInCSV ob = new SearchRecordInCSV();

        // Method calling
        ob.searchRecord(filePath);
    }
}
