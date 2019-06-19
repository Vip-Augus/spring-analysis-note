package context.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 传播事件启动类
 * @author JingQ at 2019-06-18
 */
public class EventBootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factory.bean/bean-post-processor.xml");
		// 第一个参数是来源，第二个参数是自定义
		CarEvent carEvent = new CarEvent("hello",  "world");
		context.publishEvent(carEvent);
		// 消息发送之后，打印以下内容
		// source : hello,  custom message : world
	}
}
