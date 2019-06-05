package base.label.parsing;

import domain.BaseBook;

/**
 * @author JingQ at 2019-06-05
 */
public abstract class AbstractGetBookTest {

	public void getBookName() {
		System.out.println(getDomain().getName());
	}

	/**
	 * 抽象方法，获取注入的 Book 子类
	 * @return	实现类
	 */
	public abstract BaseBook getDomain();
}
