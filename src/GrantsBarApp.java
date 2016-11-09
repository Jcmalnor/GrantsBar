import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;


public class GrantsBarApp {


	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Scanner stringscan = new Scanner(System.in);

		// introduction
		System.out.println("Hello and welcome to Grant's Bar!\n");
		
		Alcohol amount = new Alcohol("","","","");
		ArrayList<Alcohol> barArrayList = new ArrayList<Alcohol>(13);
		ArrayList <String> drinkList = new ArrayList <String>();
		ArrayList <Integer> drinkQuan = new ArrayList <Integer>();
		
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
			
			System.out.print("What drink would you like? (enter: 1-12) ");
			orderNumber = sc.nextInt();
			
			drinkList.add(barArrayList.get((orderNumber-1)).getDrinkName());
			
			orderNumber = amount.getPrice(orderNumber);
			
			
			System.out.print("How many? ");
			orderQuantity = sc.nextInt();
			drinkQuan.add(orderQuantity);
			
				// calculate total
				total = (double) orderNumber * orderQuantity + total;
				BigDecimal formattedTotal = new BigDecimal(total);
				formattedTotal = formattedTotal.setScale(2, RoundingMode.HALF_UP);
	
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
		BigDecimal formattedTotal = new BigDecimal(tax);
		formattedTotal = formattedTotal.setScale(2, RoundingMode.HALF_UP);
		System.out.println("Your total after tax is $" + formattedTotal);
		tip = order.getTip(tax);
		formattedTotal = new BigDecimal(tip);
		formattedTotal = formattedTotal.setScale(2, RoundingMode.HALF_UP);
		System.out.println("Your grand total is: $" + formattedTotal);
			
			// call checkout
			// payment method
		System.out.println("How would you like to pay? ");
		System.out.println("1. Credit Card");
		System.out.println("2. Cash");
		System.out.println("3. Check");
		int payMethod = sc.nextInt();
		Checkout $ = new Checkout();
		if (payMethod==1) {
			$.getCredit();
		} else if (payMethod==2) {
			$.getCash(total);
		} else {
			$.getCheck();
		}
			
			/*
			 * print receipt drink number price payment change
			 * print array list values for drink name and quantity
			 */
//		System.out.println("Order: \n" + drinkList + "\n" + drinkQuan);

			// New Order?
		System.out.print("Next order? (y/N)");
			// if yes loop
			// if no thanks for coming
		
		
		sc.close();
		stringscan.close();
	}
}
		
		
		
		
		
