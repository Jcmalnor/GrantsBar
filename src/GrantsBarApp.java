import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GrantsBarApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner stringscan = new Scanner(System.in);
		// introduction
		System.out.println("Hello and welcome to Grant's Bar!\n");
		// read and print menu
		File file = new File("Menu");
		String orderComplete = "n";
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		while (orderComplete.equalsIgnoreCase("n")) {
			System.out.print("What drink would you like? (enter: 1-12) ");
			int orderNumber = sc.nextInt();
			
			System.out.print("How many? ");
			int orderQuantity = sc.nextInt();
			
			System.out.print("Does that complete your order? (Y/N) ");
			orderComplete = stringscan.nextLine();
			if (orderComplete.equalsIgnoreCase("y")) {
				break;
			} else {
				continue;
			}	
			}
		
			// call take order
			// calculate total

			// call checkout
			// payment method

			/*
			 * print receipt drink number price payment change
			 */

			// New Order?
			// if yes loop
			// if no thanks for coming

		}
	}

