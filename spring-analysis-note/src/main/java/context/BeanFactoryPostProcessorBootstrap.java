package context;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注释 6.3 BeanFactory 后处理器的 demo
 * @author JingQ at 2019-06-14
 */
public class BeanFactoryPostProcessorBootstrap {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("factory.bean/factory-post-processor.xml");
		BeanFactoryPostProcessor beanFactoryPostProcessor = (BeanFactoryPostProcessor) context.getBean("carPostProcessor");
		beanFactoryPostProcessor.postProcessBeanFactory(context.getBeanFactory());
		// 输出 ：Car{maxSpeed=0, brand='*****', price=10000.0}，敏感词被替换了
		System.out.println(context.getBean("car"));

		// 硬编码 后处理器执行时间
		BeanFactoryPostProcessor hardCodeBeanFactoryPostProcessor = new HardCodeBeanFactoryPostProcessor();
		context.addBeanFactoryPostProcessor(hardCodeBeanFactoryPostProcessor);
		// 更新上下文
		context.refresh();
		// 输出 ：
		// Hard Code BeanFactory Post Processor execute time
		// Car{maxSpeed=0, brand='*****', price=10000.0}
		System.out.println(context.getBean("car"));
	}
}
