package base.factory.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注释 4.5 FactoryBean 启动类
 * @author JingQ at 2019-06-08
 */
public class FactoryBeanBootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factory.bean/factoryBean.xml");
		// 不使用 & 前缀，识别到的是 FactoryBean.getObject 返回的 car 类型
		Car car = (Car) context.getBean("carFactoryBean");
		// 输出 Car{maxSpeed=400, brand='超级跑车', price=20000.0}
		System.out.println(car.toString());

		// 使用 & 前缀，识别到的是 CarFactoryBean 本身
		CarFactoryBean bean = (CarFactoryBean) context.getBean("&carFactoryBean");
		// 输出 base.factory.bean.CarFactoryBean@4629104a
		System.out.println(bean.toString());

	}
}
