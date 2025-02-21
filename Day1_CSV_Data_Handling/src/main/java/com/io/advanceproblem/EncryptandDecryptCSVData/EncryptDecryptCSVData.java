package com.io.advanceproblem.EncryptandDecryptCSVData;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EncryptDecryptCSVData {
        private static final String ENCRYPTION_ALGORITHM = "AES";
        private static final String SECRET_KEY = "1234567890123456";

        // Method to generate the SecretKey
        private static SecretKey generateKey() throws NoSuchAlgorithmException {
            return new SecretKeySpec(SECRET_KEY.getBytes(), ENCRYPTION_ALGORITHM);
        }

        // Encrypt the data using AES
        public static String encrypt(String data) throws Exception {
            SecretKey key = generateKey();
            Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        }

        // Decrypt the data using AES
        public static String decrypt(String encryptedData) throws Exception {
            SecretKey key = generateKey();
            Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
            return new String(decryptedBytes);
        }

        // Method to write encrypted data to a CSV file
        public static void writeEncryptedCSV(String csvFile) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {
                // Write header
                writer.write("ID,Name,Email,Salary\n");

                // Example data
                String[] records = {
                        "1,John Doe,johndoe@example.com,50000",
                        "2,Jane Smith,janesmith@example.com,55000"
                };

                for (String record : records) {
                    String[] fields = record.split(",");
                    // Encrypt Email and Salary fields
                    String encryptedEmail = encrypt(fields[2]);
                    String encryptedSalary = encrypt(fields[3]);

                    // Write encrypted data
                    writer.write(fields[0] + "," + fields[1] + "," + encryptedEmail + "," + encryptedSalary + "\n");
                }

                System.out.println("Encrypted CSV file written successfully!");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Method to read encrypted CSV and decrypt sensitive data
        public static void readDecryptedCSV(String csvFile) {
            try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Skip header line
                    if (line.startsWith("ID")) {
                        continue;
                    }

                    String[] fields = line.split(",");
                    String id = fields[0];
                    String name = fields[1];
                    String encryptedEmail = fields[2];
                    String encryptedSalary = fields[3];

                    // Decrypt Email and Salary fields
                    String decryptedEmail = decrypt(encryptedEmail);
                    String decryptedSalary = decrypt(encryptedSalary);

                    // Print decrypted data
                    System.out.println("ID: " + id + ", Name: " + name + ", Email: " + decryptedEmail + ", Salary: " + decryptedSalary);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            String encryptedCsvFile = "D:\\Capgemini Notes\\encrypted_employee_data.csv";

            // Write encrypted data to CSV file
            writeEncryptedCSV(encryptedCsvFile);

            // Read and decrypt the data from CSV file
            readDecryptedCSV(encryptedCsvFile);
        }
    }

