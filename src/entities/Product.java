package entities;

public class Product {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.00;
	}
	
	public boolean nonStaticProductPredicate() {
		return price >= 100.00;
	}

	@Override
	public String toString() {
		return "Product: " + name + ", " + String.format("%.2f", price);
	}

}
