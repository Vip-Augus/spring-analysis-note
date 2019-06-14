package base.circle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author JingQ at 2019-06-11
 */
public class CircleBootstrap {

	public static void main(String[] args) {
		// 构造函数时的报错原因： Requested bean is currently in creation: Is there an unresolvable circular reference?
		ApplicationContext context = new ClassPathXmlApplicationContext("circle/circle.xml");
		CircleA circleA = (CircleA) context.getBean("circleA");
		circleA.a();
	}
}
