package com.io.intermediateproblem.SortCSVRecordByColumn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortCSVRecord {
    public static class Employee {
        String id;
        String name;
        String email;
        double salary;

        public Employee(String id, String name, String email,double salary) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Email: " + email + ", Salary: " + salary ;
        }
    }

    public static List<Employee> readCSV(String csvFile) {
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 4) {
                    String id = fields[0];
                    String name = fields[1];
                    String email = fields[2];

                  double salary = Double.parseDouble(fields[3]);
                    employees.add(new Employee(id, name, email,salary));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public static void printTop5HighestPaidEmployees(List<Employee> employees) {
        employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
                .limit(5)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        String csvFile = "D:\\Capgemini Notes\\Employee.csv";
        List<Employee> employees = readCSV(csvFile);
        System.out.println("Top 5 highest-paid employees:");
        printTop5HighestPaidEmployees(employees);
    }

}
