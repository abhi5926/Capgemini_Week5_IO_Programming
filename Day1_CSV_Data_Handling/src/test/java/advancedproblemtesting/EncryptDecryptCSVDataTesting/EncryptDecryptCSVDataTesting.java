package advancedproblemtesting.EncryptDecryptCSVDataTesting;

import org.junit.jupiter.api.Test;

import static com.io.advanceproblem.EncryptandDecryptCSVData.EncryptDecryptCSVData.readDecryptedCSV;
import static com.io.advanceproblem.EncryptandDecryptCSVData.EncryptDecryptCSVData.writeEncryptedCSV;

public class EncryptDecryptCSVDataTesting {
    @Test
    public void encryptDecryptTesting(){
        // String containing file path
        String encryptedCsvFile = "D:\\Capgemini Notes\\encrypted_employee_data.csv";

        // Write encrypted data to CSV file
        writeEncryptedCSV(encryptedCsvFile);

        // Read and decrypt the data from CSV file
        readDecryptedCSV(encryptedCsvFile);
    }
}
