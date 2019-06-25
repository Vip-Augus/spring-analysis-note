package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop 测试启动类
 * @author JingQ at 2019-06-20
 */
public class AopTestBootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/aop.xml");
		TestAopBean bean = (TestAopBean) context.getBean("aopTestBean");
		bean.testAop();
		// 输出内容 看输出顺序，了解到增强方法的执行顺序 :
		// Around proceed 之前 -> Before -> Around proceed 之后 -> After
		//around Before
		//before Test
		//I am the true aop bean
		//around After
		//after Test
	}
}
