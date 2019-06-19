package context.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 事件监听器测试类
 * @author JingQ at 2019-06-17
 */
public class CarEventListener implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof CarEvent) {
			CarEvent carEvent = (CarEvent) event;
			System.out.println("source : " + event.getSource() + ",  custom message : " + carEvent.getMsg());
		}
	}
}
