package com.Daily.Task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileDeleteRename {
	/*Q4. File Delete and Rename: Implement a 
	 * program that can delete a file and rename 
	 * a file in a directory.
	 */
	public void deleteFile(String file) {
		Path filePath = Paths.get(file);
		try {
			if(Files.deleteIfExists(filePath)) {
				System.out.println("Files deleted successfully");
			}
			else {
				System.out.println("File not found");
			}
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}
	public void renameFile(String original, String replaced) {
		Path source = Paths.get(original);
		Path target = source.resolveSibling(replaced);
		try {
			Files.move(source,target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File Renamed Successfully");
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		String ogPath = "C:\\Users\\RSharvesh\\Downloads\\replaced.txt";
		FileDeleteRename fdr = new FileDeleteRename();
		fdr.renameFile(ogPath, "replaced1.txt");
		fdr.deleteFile("C:\\Users\\RSharvesh\\Downloads\\replaced1.txt");
	}
}
