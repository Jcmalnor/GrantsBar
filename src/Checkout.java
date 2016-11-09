import java.util.Scanner;

public class Checkout {
	/*
	 * create payment variables
	 * prompt user for payment type (cash, credit, check)
	 * create get methods for types
	 * return change if applicable/remaining balance
	 */
	
	double cash;
	String creditCard;
	double check;
	double amount;
	
	Scanner payMethod = new Scanner(System.in);
	
	public String getCredit() {
		System.out.println( "Enter Credit card Number: ");
		creditCard = payMethod.next();
		System.out.println("Enter Expiration Date: ");
		String expDate = payMethod.next();
		System.out.println("Enter CVV: ");
		int cvv = payMethod.nextInt();	
		return "Thank you";
	}
	
	public String getCash(double x) {		
		System.out.println("Enter Tender");
		cash = payMethod.nextInt();
		amount = x-cash;
		return "Your change is: " + amount;
	}
	

	public String getCheck() {
		
			System.out.print("Enter Check Number: ");
			check = payMethod.nextInt();
			return "Thank You";
		}

}

	

