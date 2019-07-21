package domain;

/**
 * 复杂一点的书
 * @author JingQ at 2019-06-05
 */
public class ComplexBook extends BaseBook {

	private String tag;

	public ComplexBook() {}

	public ComplexBook(String name, String tag) {
		setName(name);
		this.tag = tag;
	}

	@Override
	public String getName() {
		return super.getName() == null ? "Complex book name" : super.getName();
	}


	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
}
