package context.event;

import org.springframework.context.ApplicationEvent;

/**
 * 事件测试类
 * @author JingQ at 2019-06-17
 */
public class CarEvent extends ApplicationEvent {

	private static final long serialVersionUID = -8513182514355844870L;

	/**
	 * 自定义一个消息
	 */
	private String msg;
	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public CarEvent(Object source) {
		super(source);
	}

	public CarEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
