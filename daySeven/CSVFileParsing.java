package com.Daily.Task5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CSVFileParsing {
public static void main(String[] args) {
	/*
	 * Q3. CSV File Parsing: 
	 * Read and parse data from a CSV 
	 * (Comma-Separated Values) file, 
	 * and display the output as directed below:
	 */
		String filePath = "C:\\Users\\RSharvesh\\Downloads\\employees.txt";
		Map<String, List<String>> departmentEmployees = new HashMap<>();

		// Read and parse the CSV file
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			reader.readLine(); // Skip header line

			while ((line = reader.readLine()) != null) {
				String[] columns = line.split(",");
				String employeeID = columns[0].trim();
				String employeeName = columns[1].trim();
				String department = columns[2].trim();

				departmentEmployees.computeIfAbsent(department, k -> new ArrayList<>())
						.add("Employee ID: " + employeeID + ", Name: " + employeeName);
			}
		}
		catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
			return;
		}

		// Get department input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Department Name: ");
		String departmentInput = scanner.nextLine().trim();
		scanner.close();
		// Display employees in the specified department
		List<String> employees = departmentEmployees.get(departmentInput);
		if (employees != null && !employees.isEmpty()) {
			System.out.println("Employees in " + departmentInput + " Department:");
			employees.forEach(System.out::println);
		} else {
			System.out.println("No employees found in the " + departmentInput + " department.");
		}
}
}
