import java.util.Scanner;

public class TakeOrder {
	/*
	 * create method getTakeOrder create variable prompt user to input order and
	 * quantity store user input (drink selection) prompt user for more menu
	 * items if yes show menu again if no break; prompt user for tip calculate
	 * total = line price * quantity add tax and tip return total
	 */
	Scanner sc = new Scanner(System.in);
	Scanner stringscan = new Scanner(System.in);
	private String orderComplete = null;
	private int orderNumber = 0;
	private int orderQuantity = 0;
	private double total = 0;
	Alcohol price = new Alcohol();

	public String getTakeOrder() {
		System.out.print("What drink would you like? (enter: 1-12) ");
		orderNumber = sc.nextInt();
		orderNumber = price.getPrice(orderNumber);

		System.out.print("How many? ");
		orderQuantity = sc.nextInt();

		System.out.print("Does that complete your order? (Y/N) ");
		orderComplete = stringscan.nextLine();
		return orderComplete;
	}

	public double getTotal() {
		total = (double) orderNumber * orderQuantity;
		return total;
	}
	
	public double getTax() {
		double tax = 1.06;
		total *= tax;
		return total;
	}
	
	public double getTip() {
		System.out.print("What percent would you like to tip? (10,15,20,25,30) ");
		int tip = sc.nextInt();
		switch (tip) {
		case 10:
			double tip1 = 1.1;
			total *= tip1;
			return total;
		case 15:
			double tip2 = 1.15;
			total *= tip2;
			return total;
		case 20:
			double tip3 = 1.20;
			total *= tip3;
			return total;
		case 25:
			double tip4 = 1.25;
			total *= tip4;
			return total;
		case 30:
			double tip5 = 1.30;
			total *= tip5;
			return total;
		default:
			break;
		}
		return total;
	}

}
