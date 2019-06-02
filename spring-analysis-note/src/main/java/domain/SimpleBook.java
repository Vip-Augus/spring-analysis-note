package domain;


/**
 * domain book
 * @author JingQ at 2019-06-01
 */
public class SimpleBook {

	private int id;

	private String name = "Default Name";

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
}
