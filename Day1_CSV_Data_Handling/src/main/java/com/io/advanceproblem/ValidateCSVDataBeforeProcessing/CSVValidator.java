package com.io.advanceproblem.ValidateCSVDataBeforeProcessing;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class CSVValidator {
    // Validator method
    public static void validator(String csvFile) {

        String line;
        String delimiter = ",";
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"); // Regex for valid email

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int lineNumber = 0;
            // Read the CSV line by line
            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] columns = line.split(delimiter);

                String email = columns[0].trim();
                String phone = columns[1].trim();

                boolean isValid = true;

                // Validate Email
                if (!isValidEmail(email, emailPattern)) {
                    System.out.println("Line " + lineNumber + ": Invalid email - " + email);
                    isValid = false;
                }

                // Validate Phone Number
                if (!isValidPhoneNumber(phone)) {
                    System.out.println("Line " + lineNumber + ": Invalid phone number - " + phone);
                    isValid = false;
                }

                // If either email or phone number is invalid, print the row with error
                if (!isValid) {
                    System.out.println("Line " + lineNumber + " is invalid: " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to check if email is valid using regex
    private static boolean isValidEmail(String email, Pattern pattern) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Method to check if phone number contains exactly 10 digits
    private static boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\d{10}");
    }

    public static void main(String[] args) {
        // Path to your CSV file
        String csvFile = "D:\\Capgemini Notes\\CSVValidator.csv";

        // Calling the validator method
        CSVValidator.validator(csvFile);
    }
}
