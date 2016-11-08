import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class GrantsBarApp {

	public static void main(String[] args) {
		
		// introduction
		System.out.println("Hello and welcome to Grant's Bar!\n");
		// read and print menu
		File file = new File("Menu");
		String newOrder = "n";
		TakeOrder order = new TakeOrder();
		double total1 = 0;
		double total2 = 0;
		String menu = "";
		
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
		
		Scanner file = new Scanner (new File("Menu")).useDelimiter(",\\"); 
		List <String> menu = new ArrayList<String>();
		 while (file.hasNext()) {
		      // find next line
		      menu = inFile1.next();
		      temps.add(menu);
		    }
		    file.close();
		
		    String[] menuArray = menu.toArray(new String[5]);

		    for (String m : menuArray) {
		      System.out.println(m);
		    }
		
		
		
		
		
		
		
		
		
//		while (newOrder.equalsIgnoreCase("n")) {
//			
//			// call take order
//			newOrder = order.getTakeOrder();
//			// calculate total
//			total2 = order.getTotal();
//	
//			if (newOrder.equalsIgnoreCase("y")) {
//				total1 += total2;
//				break;
//			} else {
//				continue;
//			}	
//			}
//			total1 = order.getTax();
//			System.out.println("Your total after tax is $" + total1);
//			
//			total1 = order.getTip();
//			System.out.println(total1);
//			
//			// call checkout
//			// payment method
//
//			/*
//			 * print receipt drink number price payment change
//			 */
//
//			// New Order?
//			// if yes loop
//			// if no thanks for coming

		}
}
