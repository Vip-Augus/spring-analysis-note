package context.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author JingQ at 2019-06-18
 */
public class AnotherEventListener implements ApplicationListener<CarEvent> {
	@Override
	public void onApplicationEvent(CarEvent event) {
		System.out.println("I am another Listener");
	}
}
