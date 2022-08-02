package builder_beispiel_dozent.product;

import java.util.LinkedHashSet;

public class Product {
	private LinkedHashSet<String> parts;
	
	public Product() {
		parts =  new LinkedHashSet<>();
	}
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		System.out.println("Produkt besteht aus: ");
		
		for(String part: parts) {
			System.out.println(part);
		}
	}
}
