
public class Alcohol {

	private String drinkName = null;
	private String price = null;
	private String category = null;
	private String description = null;
	
	public Alcohol(String drinkName, String price, String category, String description) {
		this.drinkName = drinkName;
		this.price = price;
		this.category = category;
		this.description = description;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public String getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return description;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Getters
//	public String getPrice(int x) {
//		switch (x) {
//		case 1:
//			price = "5";
//			return price;
//		case 2:
//			price = "5";
//			return price;
//		case 3:
//			price = "7";
//			return price;
//		case 4:
//			price = "6";
//			return price;
//		case 5:
//			price = "5";
//			return price;
//		case 6:
//			price = "5";
//			return price;
//		case 7:
//			price = "6";
//			return price;
//		case 8:
//			price = "7";
//			return price;
//		case 9:
//			price = "7";
//			return price;
//		case 10:
//			price = "8";
//			return price;
//		case 11:
//			price = "4";
//			return price;
//		case 12:
//			price = "50";
//			return price;
//		default:
//			break;
//		}
//
//		return price;
//	}

}
