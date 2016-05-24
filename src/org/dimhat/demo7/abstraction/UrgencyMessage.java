package org.dimhat.demo7.abstraction;

import org.dimhat.demo7.implementor.MessageImplementor;

//加急消息
public class UrgencyMessage extends AbstractMessage {

	public UrgencyMessage(MessageImplementor impl) {
		super(impl);
	}

	public void sendMessage(String message, String toUser) {
		message = "加急：" + message;
		super.sendMessage(message, toUser);
	}

	// 扩展自己的新功能：监控某消息的处理过程
	public Object watch(String messageId) {
		// 获取相应的数据，组织成监控的数据对象，然后返回
		return null;
	}

}
