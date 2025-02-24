package com.io.HandsOnPracticeProblem.GenerateJSONReportFromDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.json.JSONArray;
import org.json.JSONObject;

public class GenerateJSONRPORTFromDatabaseReport {
    public static void generateReport(String url,String user,String password,String query) {
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            JSONArray jsonArray = new JSONArray();
            while (rs.next()) {
                JSONObject obj = new JSONObject();
                obj.put("column1", rs.getString("column1"));
                obj.put("column2", rs.getString("column2"));
                obj.put("column3", rs.getString("column3"));
                // Add more columns as needed
                jsonArray.put(obj);
            }
            // Output JSON array
            System.out.println(jsonArray.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/abhishekserver12872@124";
        String user = "abhi5926";
        String password = "Abhis@456";
        String query = "SELECT * FROM AbhishekRecords";

        // Calling Method
        generateReport(url,user, password,query);
    }
}



