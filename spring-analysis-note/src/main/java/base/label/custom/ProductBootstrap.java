package base.label.custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自定义标签启动
 * @author JingQ at 2019-06-08
 */
public class ProductBootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("custom/custom-label.xml");
		Product product = (Product) context.getBean("product");
		// 输出 Product{, productId ='1', unit='台', name='Apple'}
		System.out.println(product.toString());
	}
}
