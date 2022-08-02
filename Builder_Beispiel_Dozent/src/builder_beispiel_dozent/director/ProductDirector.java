package builder_beispiel_dozent.director;

import builder_beispiel_dozent.builder.IProductBuilder;

public class ProductDirector {
	private IProductBuilder iProductbuilder;
	
	public void construct(IProductBuilder ipb) {
		this.iProductbuilder = ipb;
		this.iProductbuilder.buildBody();
		this.iProductbuilder.insertWheels();
		this.iProductbuilder.addHeadLights();
	}
}
