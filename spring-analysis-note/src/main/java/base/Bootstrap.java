package base;

import base.label.parsing.AbstractGetBookTest;
import base.label.parsing.BeforeMethodReplaced;
import base.label.parsing.TestConstructorArg;
import base.label.parsing.TestPropertyParseElement;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.SimpleBook;

/**
 * 1.1 使用 ClassPathXmlApplicationContext 注册和使用 bean
 * @author JingQ at 2019-06-01
 */
public class Bootstrap {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		SimpleBook book = (SimpleBook) context.getBean("book");
		// 输出 Default Name
		System.out.println(book.getName());

		// lookup 测试
		AbstractGetBookTest bookTest = (AbstractGetBookTest) context.getBean("getBookTest");
		// 输出 Complex book name
		bookTest.getBookName();

		// replace 测试
		BeforeMethodReplaced methodReplaced = (BeforeMethodReplaced) context.getBean("beforeMethodReplaced");
		// 输出 change it, i am a fake book
		methodReplaced.printDefaultName();

		// constructor-arg 测试
		TestConstructorArg constructorArg = (TestConstructorArg) context.getBean("testConstructorArg");
		// 输出 TestConstructorArg{name='JingQ', age=23}
		System.out.println(constructorArg.toString());

		// property 测试
		TestPropertyParseElement propertyParseElement = (TestPropertyParseElement) context.getBean("testPropertyParseElement");
		// 输出 TestPropertyParseElement{id=1, name='JingQ'}
		System.out.println(propertyParseElement);
	}
}
