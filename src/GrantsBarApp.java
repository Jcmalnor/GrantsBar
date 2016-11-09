import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GrantsBarApp {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Scanner stringscan = new Scanner(System.in);
		// introduction
		System.out.println("Hello and welcome to Grant's Bar!\n");
		
		ArrayList<Alcohol> barArrayList = new ArrayList<Alcohol>(12);
		File file = new File(System.getProperty("user.dir") + "/Menu.txt");
		
		TakeOrder order = new TakeOrder();
		double total = 0;
		double total1 = 0;
		String orderComplete = "n";
		int orderNumber = 0;
		int orderQuantity = 0;
		
		
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] menuItems = line.split(",");
			
			barArrayList.add(new Alcohol(menuItems[0], menuItems[1], menuItems[2], menuItems[3]));
		
		}
		
	
		
		
	
		
		while (orderComplete.equalsIgnoreCase("n")) {

			for (Alcohol a: barArrayList) {
				System.out.println(a.getDrinkName() + ", " + a.getCategory() + a.getPrice());
			}
			// call take order
			// newOrder = order.getTakeOrder();
			System.out.print("What drink would you like? (enter: 1-12) ");
			orderNumber = sc.nextInt();
			

			System.out.print("How many? ");
			orderQuantity = sc.nextInt();
			
				// calculate total
				total = (double) orderNumber * orderQuantity + total;
			
			System.out.println("Your total is: " + total);
			System.out.print("Does that complete your order? (Y/N) ");
			orderComplete = stringscan.nextLine();

			if (orderComplete.equalsIgnoreCase("y")) {
				break;
			}
		}
		
		double tax = 0;
		double tip = 0;
		tax = order.getTax(total);
		System.out.println("Your total after tax is $" + tax);
		tip = order.getTip(tax);
		System.out.println(tip);

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
