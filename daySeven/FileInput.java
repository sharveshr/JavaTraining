package com.Daily.Task5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInput {
public static void main(String[] args) {
	/*Q5. Take an input from an user 
	 * and write to a file. 
	 * You can take any input and can write to 
	 * any file of your choice.
	 */
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the file path where you want to save the content: ");
    String filePath = scanner.nextLine();

    // Prompt user for content to write
    System.out.println("Enter the content you want to write to the file:");
    String content = scanner.nextLine();

    // Write content to the specified file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        writer.write(content);
        System.out.println("Content successfully written to " + filePath);
    } catch (IOException e) {
        System.err.println("An error occurred while writing to the file: " + e.getMessage());
    } finally {
        scanner.close();
    }
}
}

