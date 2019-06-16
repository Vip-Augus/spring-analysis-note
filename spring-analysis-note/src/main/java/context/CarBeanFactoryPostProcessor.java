package context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

import java.util.Set;

/**
 * @author JingQ at 2019-06-14
 */
public class CarBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	/**
	 * 敏感词
	 */
	private Set<String> obscenties;

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// 从 beanFactory 中获取 bean 名字列表
		String[] beanNames = beanFactory.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			BeanDefinition definition = beanFactory.getBeanDefinition(beanName);
			StringValueResolver valueResolver = strVal -> {
				if (isObscene(strVal)) return "*****";
				return strVal;
			};
			BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(valueResolver);
			// 这一步才是真正处理 bean 的配置信息
			visitor.visitBeanDefinition(definition);
		}

	}

	/**
	 * 判断 value 是否在敏感词列表中
	 * @param value	值
	 * @return		boolean
	 */
	private boolean isObscene(Object value) {
		String potentialObscenity = value.toString().toUpperCase();
		return this.obscenties.contains(potentialObscenity);
	}

	public Set<String> getObscenties() {
		return obscenties;
	}

	public void setObscenties(Set<String> obscenties) {
		this.obscenties = obscenties;
	}
}
