package builder_beispiel_dozent.builder;

import builder_beispiel_dozent.product.Product;

public interface IProductBuilder {
	public void buildBody();
	public void insertWheels();
	public void addHeadLights();
	public Product getVehicle();
}
