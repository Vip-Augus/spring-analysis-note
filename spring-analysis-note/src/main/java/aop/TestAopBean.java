package aop;

/**
 * aop 测试，被拦截的 bean
 * @author JingQ at 2019-06-20
 */
public class TestAopBean {

	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void testAop() {
		System.out.println("I am the true aop bean");
	}
}
