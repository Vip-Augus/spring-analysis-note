package aop.expose.proxy;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试 aop 的 expose-proxy 属性，实现
 * @author JingQ at 2019-06-22
 */
public class TestServiceImpl implements TestService {

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void a() {
		this.b();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void b() {
		System.out.println("Hello world");
	}
}
