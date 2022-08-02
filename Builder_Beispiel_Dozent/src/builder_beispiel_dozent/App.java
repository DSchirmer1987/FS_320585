package builder_beispiel_dozent;

import builder_beispiel_dozent.builder.Car;
import builder_beispiel_dozent.builder.Motorcycle;
import builder_beispiel_dozent.director.ProductDirector;
import builder_beispiel_dozent.product.Product;

public class App {

	public static void main(String[] args) {
		System.out.println("Builder Pattern Beispiel");
		
		ProductDirector director = new ProductDirector();
		
		// Erstelle Car
		Car c = new Car();
		director.construct(c);
		Product p1 = c.getVehicle();
		p1.show();
		
		// Erstelle Motorcycle
		Motorcycle m = new Motorcycle();
		director.construct(m);
		Product p2 = m.getVehicle();
		p2.show();
	}

}
