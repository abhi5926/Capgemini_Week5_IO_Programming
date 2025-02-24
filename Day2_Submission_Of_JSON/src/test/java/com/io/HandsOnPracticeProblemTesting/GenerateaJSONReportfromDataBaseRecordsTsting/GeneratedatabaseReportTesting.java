package com.io.HandsOnPracticeProblem.GenerateaJSONReportfromDataBaseRecordsTsting;

import com.io.HandsOnPracticeProblem.GenerateJSONReportFromDatabase.GenerateJSONRPORTFromDatabaseReport;
import org.junit.jupiter.api.Test;

public class GeneratedatabaseReportTesting {
    @Test
    void generateDatabaseReport(){
        String url = "jdbc:mysql://localhost:3306/abhishekserver12872@124";
        String user = "abhi5926";
        String password = "Abhis@456";
        String query = "SELECT * FROM AbhishekRecords";

        // Creating class Object
        GenerateJSONRPORTFromDatabaseReport ob = new GenerateJSONRPORTFromDatabaseReport();

        // Calling Method
        ob.generateReport(url,user, password,query);
    }
}
