package base;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.SimpleBook;

/**
 * 1.1 使用 ClassPathXmlApplicationContext 注册和使用 bean
 * @author JingQ at 2019-06-01
 */
public class Bootstrap {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		SimpleBook book = context.getBean(SimpleBook.class);
		System.out.println(book.getName());
	}
}
