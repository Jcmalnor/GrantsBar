import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.validation.Validator;

public class GrantsBarApp {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Scanner stringscan = new Scanner(System.in);
		

		// introduction
		System.out.println("Hello and welcome to Grant's Bar!\n");

		Alcohol amount = new Alcohol("", "", "", "");
		ArrayList<Alcohol> barArrayList = new ArrayList<Alcohol>(13);
		ArrayList<String> drinkList = new ArrayList<String>();
		ArrayList<Integer> drinkQuan = new ArrayList<Integer>();

		File file = new File(System.getProperty("user.dir") + "/Menu.txt");

		TaxAndTip order = new TaxAndTip();
		double total = 0;

		double total1 = 0;

		int orderNumber = 0;
		int orderQuantity = 0;
		int sum = 0;

		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] menuItems = line.split(",");

			barArrayList.add(new Alcohol(menuItems[0], menuItems[1], menuItems[2], menuItems[3]));

		}
		String ans = "y";
		while (ans.equalsIgnoreCase("y")) {
			for (Alcohol a : barArrayList) {
				System.out.println(a.getDrinkName() + ", " + a.getCategory() + ", " + a.getPrice() + ", " + a.getDescription() + "\n");
			}

			String orderComplete = "n";
			while (orderComplete.equalsIgnoreCase("n")) {

				// order from menu
				System.out.print("What drink would you like? (enter: 1-12) ");
				orderNumber = sc.nextInt();
				orderNumber = BarValidator.getMenuItem(orderNumber);
				
				drinkList.add(barArrayList.get((orderNumber - 1)).getDrinkName());

				orderNumber = amount.getPrice(orderNumber);

				// prompt quantity of this drink
				System.out.print("How many? ");
				orderQuantity = sc.nextInt();
				orderQuantity = BarValidator.getPositive(orderQuantity);
				drinkQuan.add(orderQuantity);

				// calculate total and format
				total = (double) orderNumber * orderQuantity + total;
				BigDecimal formattedTotal = new BigDecimal(total);
				formattedTotal = formattedTotal.setScale(2, RoundingMode.HALF_UP);

				// print subtotal and prompt for more/different drinks
				System.out.println("Your sub total is: " + total);
				System.out.print("Does that complete your order? (Y/N) ");
				orderComplete = stringscan.nextLine();
				orderComplete = BarValidator.getYN(orderComplete);

				if (orderComplete.equalsIgnoreCase("y")) {
					break;
				}
			}

			double tax = 0;
			double tip = 0;
			
			// add tax
			tax = order.getTax(total);
			BigDecimal formattedTotal = new BigDecimal(tax);
			formattedTotal = formattedTotal.setScale(2, RoundingMode.HALF_UP);
			System.out.println("Your total after tax is $" + formattedTotal);
			
			// add tip
			tip = order.getTip(tax);
			
			formattedTotal = new BigDecimal(tip);
			formattedTotal = formattedTotal.setScale(2, RoundingMode.HALF_UP);
			System.out.println("Your grand total is: $" + formattedTotal);

			// checkout with specific payment method
			System.out.println("1. Credit Card");
			System.out.println("2. Cash");
			System.out.println("3. Check");
			System.out.print("How would you like to pay? ");
			int payMethod = sc.nextInt();
			
			Checkout $ = new Checkout();
			if (payMethod == 1) {
				$.getCredit();
			} else if (payMethod == 2) {
				$.getCash(tip);
			} else {
				$.getCheck();
			}

			/*
			 * print receipt drink number price payment change print array list
			 * values for drink name and quantity
			 */
			for (int m: drinkQuan) {
				sum += m;
			}
			System.out.println("You ordered: " + sum + " drinks.");
			System.out.println("You ordered: ");
			for (String m: drinkList) {
				System.out.println(m);
			}
			
			// New Order?
			System.out.print("Another order? (Y/N) ");
			ans = stringscan.nextLine();
			ans = BarValidator.getYN(ans);
			// if yes loop
			// if no thanks for coming
			if (ans.equalsIgnoreCase("n")) {
				System.out.println("DEUCES");
			}
		}
	}
}

