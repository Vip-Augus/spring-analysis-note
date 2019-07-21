package base.label.custom;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * 注释 3.5 自定义标签解析器
 * @author JingQ at 2019-06-08
 */
public class ProductBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<Product> getBeanClass(Element element) {
		// 返回对应的类型
		return Product.class;
	}

	/**
	 * 从 element 中解析并提取对应的元素
	 * @param element the XML element being parsed
	 * @param builder used to define the {@code BeanDefinition}
	 */
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {

		String productId = element.getAttribute("productId");
		String productName = element.getAttribute("name");
		String productUnit = element.getAttribute("unit");
		// 将提取到的数据放入 BeanDefinitionBuilder 中，等到完成所有 bean 的解析之后统一注册到 beanFactory 中
		if (productId != null) {
			// element.getAttribute("") 方法取出来的都是 string 类型，使用时记得手动转换
			builder.addPropertyValue("productId", Integer.valueOf(productId));
		}
		if (StringUtils.hasText(productName)) {
			builder.addPropertyValue("name", productName);
		}
		if (StringUtils.hasText(productUnit)) {
			builder.addPropertyValue("unit", productUnit);
		}
	}
}
