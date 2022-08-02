package builder_beispiel_dozent.builder;

import builder_beispiel_dozent.product.Product;

public class Car implements IProductBuilder {
	private Product product = new Product();
	
	@Override
	public void buildBody() {
		product.add("Der Body vom Car");
	}

	@Override
	public void insertWheels() {
		product.add("4 Räder");

	}

	@Override
	public void addHeadLights() {
		product.add("2 Scheinwerfer");

	}

	@Override
	public Product getVehicle() {
		return product;
	}

}
