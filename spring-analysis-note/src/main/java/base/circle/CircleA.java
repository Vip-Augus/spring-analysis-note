package base.circle;

/**
 * 循环依赖 A
 * @author JingQ at 2019-06-11
 */
public class CircleA {

	private CircleB circleB;


	/**
	 * 设定一个函数，调用 B 类的方法
	 */
	public void a() {
		System.out.println("A");
		circleB.b();
	}

	public CircleB getCircleB() {
		return circleB;
	}

	public void setCircleB(CircleB circleB) {
		this.circleB = circleB;
	}
}
