package advancedproblemtesting.ConvertJSONToCSVVIceVersaTesting;

import com.io.advanceproblem.ConvertJSONtoCSVandVIceVersa.ConvertJSONTOCSV;
import org.junit.jupiter.api.Test;

public class ConvertJSONToCSVTesting {
    @Test
    public void convertJSONTOCSV(){
        // Creating String to Store file path
        // Example file paths - Ensure these paths exist on your system
        String jsonFile = "D:\\Capgemini Notes\\StudentJSONFile.json";
        String csvFile = "D:\\Capgemini Notes\\ConvertingJSONToCSV.csv";

        // Creating class Object
        ConvertJSONTOCSV ob = new ConvertJSONTOCSV();
        // Method calling
        ob.jsonToCSV(jsonFile, csvFile);

    }
}
