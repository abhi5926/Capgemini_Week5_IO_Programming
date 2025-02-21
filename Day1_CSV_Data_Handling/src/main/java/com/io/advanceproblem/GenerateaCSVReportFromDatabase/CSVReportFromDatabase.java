package com.io.advanceproblem.GenerateaCSVReportFromDatabase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class CSVReportFromDatabase {

    public static void generateCSV(String csvFile) {
        // Update these with actual database details
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database";
        String dbUsername = "your_username";
        String dbPassword = "your_password";
        String query = "SELECT employee_id, name, department, salary FROM employees";

        try (Connection connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query);
             BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {

            // Writing headers
            writer.write("Employee ID,Name,Department,Salary\n");

            // Writing employee data from database to CSV
            while (resultSet.next()) {
                int id = resultSet.getInt("employee_id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
                double salary = resultSet.getDouble("salary");

                writer.write(id + "," + name + "," + department + "," + salary + "\n");
            }

            System.out.println("CSV report generated successfully!");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Specify the path to save the CSV file
        String csvFile = "D:\\Capgemini Notes\\StudentRecord.csv"; // Change path as required
        generateCSV(csvFile);
    }
}
