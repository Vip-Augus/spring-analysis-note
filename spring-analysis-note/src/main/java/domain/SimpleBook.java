package domain;


/**
 * domain book
 * @author JingQ at 2019-06-01
 */
public class SimpleBook extends BaseBook{


	@Override
	public String getName() {
		return super.getName() == null ? "Default Name" : super.getName();
	}

}
