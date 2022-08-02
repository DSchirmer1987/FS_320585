package builder_beispiel_dozent.builder;

import builder_beispiel_dozent.product.Product;

public class Motorcycle implements IProductBuilder {
	private Product product = new Product();
	
	@Override
	public void buildBody() {
		product.add("Der Body vom Motorcylce");
	}

	@Override
	public void insertWheels() {
		product.add("2 Räder");

	}

	@Override
	public void addHeadLights() {
		product.add("1 Scheinwerfer");

	}

	@Override
	public Product getVehicle() {
		return product;
	}

}
