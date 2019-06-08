package base.label.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 注释 3.6 自定义标签注册器
 * @author JingQ at 2019-06-08
 */
public class ProductBeanHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		// 将组件解析器进行注册到 `Spring` 容器
		registerBeanDefinitionParser("product", new ProductBeanDefinitionParser());
	}
}
