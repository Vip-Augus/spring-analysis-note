package base.circle;

/**
 * 循环依赖 B
 * @author JingQ at 2019-06-11
 */
public class CircleB {

	private CircleA circleA;


	/**
	 * 设定一个方法，调用 A 类的方法，这两个方法互相调用
	 */
	public void b() {
		System.out.println("B");
		circleA.a();
	}

	public CircleA getCircleA() {
		return circleA;
	}

	public void setCircleA(CircleA circleA) {
		this.circleA = circleA;
	}
}
