import java.util.Scanner;


public  class BarValidator {

	static Scanner scan = new Scanner(System.in);
	
	public static int getMenuItem (int menuItem) {

		while (true) {
			if ((menuItem >= 1) && menuItem <= 12) {
				break;
			} else {
				System.out.print("Please enter a valid order number! (1-12) ");
				menuItem = scan.nextInt();
			}
		}
		return menuItem;	
	}
	
	public static int getPositive(int x) {
		while (true) {
		if (x<0) {
			System.out.print("Please enter a positive number: ");
			x = scan.nextInt();
		} else {
			return x;
		}
		}
	}
	
	
	public static String getYN(String x) {
		while (true) {
		if (x.equalsIgnoreCase("y") || x.equalsIgnoreCase("n")) {
			return x;
		} else {
			System.out.println("Please enter Y or N");
			x = scan.nextLine();
		}
		}
	}
	
	public static int getValidTip(int x) {
		while (true) {
			if (x==10||x==15||x==20||x==25||x==30) {
				return x;
			} else {
				System.out.print("Please enter valid tip: ");
				x = scan.nextInt();
			}
		}
	}
	
}