
public class Alcohol {

	private String drinkName = null;
	private String price = null;
	private String category = null;
	private String description = null;
	private int amount = 0;
	
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
	public int getPrice(int x) {
		switch (x) {
		case 1:
			amount = 5;
			return amount;
		case 2:
			amount = 5;
			return amount;
		case 3:
			amount = 7;
			return amount;
		case 4:
			amount = 6;
			return amount;
		case 5:
			amount = 5;
			return amount;
		case 6:
			amount = 5;
			return amount;
		case 7:
			amount = 6;
			return amount;
		case 8:
			amount = 7;
			return amount;
		case 9:
			amount = 7;
			return amount;
		case 10:
			amount = 8;
			return amount;
		case 11:
			amount = 4;
			return amount;
		case 12:
			amount = 50;
			return amount;
		default:
			break;
		}

		return amount;
	}

}
