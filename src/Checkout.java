import java.math.BigDecimal;
import java.math.RoundingMode;
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
		amount = cash-x;
		BigDecimal formattedAmount = new BigDecimal(amount);
		formattedAmount = formattedAmount.setScale(2, RoundingMode.HALF_UP);
		System.out.println("Your change is: $" + formattedAmount);
		return "Thank You";
	}
	

	public String getCheck() {
		
			System.out.print("Enter Check Number: ");
			check = payMethod.nextInt();
			return "Thank You";
		}

}

	

