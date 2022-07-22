package beispiele_dozent_fs2;

import java.io.Serializable;

/**
 * Die Klasse um einen Customer darzustellen
 * @author CC_Dozent
 *
 */
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
