import java.util.Scanner;

public class TaxAndTip {
	/*
	 * create method getTakeOrder create variable prompt user to input order and
	 * quantity store user input (drink selection) prompt user for more menu
	 * items if yes show menu again if no break; prompt user for tip calculate
	 * total = line price * quantity add tax and tip return total
	 */
	Scanner sc = new Scanner(System.in);
	Scanner stringscan = new Scanner(System.in);
	double total = 0.0;
	
	public double getTax(double x) {
		double tax = 1.06;
		x *= tax;
		return x;
	}
	
	public double getTip(double x) {
		System.out.print("What percent would you like to tip? (10,15,20,25,30) ");
		int tip = sc.nextInt();
		tip = BarValidator.getValidTip(tip);
		switch (tip) {
		case 10:
			double tip1 = 1.1;
			x *= tip1;
			return x;
		case 15:
			double tip2 = 1.15;
			x *= tip2;
			return x;
		case 20:
			double tip3 = 1.20;
			x *= tip3;
			return x;
		case 25:
			double tip4 = 1.25;
			x *= tip4;
			return x;
		case 30:
			double tip5 = 1.30;
			x *= tip5;
			return x;
		default:
			break;
		}
		return x;
	}
	

}
