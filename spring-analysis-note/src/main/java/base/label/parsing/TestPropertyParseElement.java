package base.label.parsing;

/**
 * 测试 property 属性
 * @author JingQ at 2019-06-05
 */
public class TestPropertyParseElement {

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

	@Override
	public String toString() {
		return "TestPropertyParseElement{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
