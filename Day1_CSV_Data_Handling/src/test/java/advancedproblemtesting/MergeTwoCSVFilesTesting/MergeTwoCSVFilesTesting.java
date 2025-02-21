package advancedproblemtesting.MergeTwoCSVFilesTesting;

import com.io.advanceproblem.MergeTwoCSVFiles.MergeTwoCSV;
import org.junit.jupiter.api.Test;

public class MergeTwoCSVFilesTesting {
    // Creating String to Store file path
    String students1File = "D:\\Capgemini Notes\\Student1.csv";
    String students2File = "D:\\Capgemini Notes\\Student2.csv";
    String outputFile = "D:\\Capgemini Notes\\OutputCSVFile.csv";

    @Test
    public void mergeCSV(){
        // Creating class Object
        MergeTwoCSV ob = new MergeTwoCSV();

        // Method calling
        ob. mergeCSV( students1File, students2File,outputFile);
    }
}
