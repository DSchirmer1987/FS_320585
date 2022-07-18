package xml_beispiele_dozent;

public class Food {
	private String name;
	private String price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public Food() {
		super();
		this.name = "Default-Food";
		this.price = "$1.99";
	}
	
	public Food(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}
}
