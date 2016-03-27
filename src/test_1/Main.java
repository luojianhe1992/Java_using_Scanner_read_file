package test_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		if (file.exists()) {
			try {
				// uisng a Scanner object to read a file.
				Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else{
			System.out.println(file.getAbsolutePath() + " did not exist.");
		}
		
		System.out.println("*****************************************************");
		
		if (file.exists()) {
			try {
				// uisng a Scanner object to read a file.
				Scanner scanner = new Scanner(file);
				// scan token by token
				while (scanner.hasNext()) {
					System.out.println(scanner.next());
				}
				scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else{
			System.out.println(file.getAbsolutePath() + " did not exist.");
		}
		
		
		
	}
}
