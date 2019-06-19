package context.bean;

import base.factory.bean.Car;
import domain.ComplexBook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean 后处理器 启动类
 * @author JingQ at 2019-06-17
 */
public class CarBeanPostProcessorBootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factory.bean/bean-post-processor.xml");
		Car car = (Car) context.getBean("car");
		ComplexBook book = (ComplexBook) context.getBean("book");
		System.out.println(car);
		System.out.println(book);

		// 实测，ClassPathXmlApplicationContext 无法在应用中硬编码，只能从配置文件中注册，延迟加载 bean 或者其它 BeanFactory 或许会支持硬编码
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("factory.bean/bean-post-processor.xml");
//		CarBeanPostProcessor processor = new CarBeanPostProcessor();
//		context.getBeanFactory().addBeanPostProcessor(processor);
	}
}
