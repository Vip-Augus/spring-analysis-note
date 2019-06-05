package base.label.parsing;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * replaced-method 测试，需要实现接口 MethodReplacer
 * @author JingQ at 2019-06-05
 */
public class TestMethodReplaced implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("change it, i am a fake book");
		return null;
	}
}
