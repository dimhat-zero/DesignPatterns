package org.dimhat.demo7.message;

import org.dimhat.demo7.message.abstraction.AbstractMessage;
import org.dimhat.demo7.message.abstraction.CommonMessage;
import org.dimhat.demo7.message.abstraction.UrgencyMessage;
import org.dimhat.demo7.message.implementor.MessageEmail;
import org.dimhat.demo7.message.implementor.MessageImplementor;
import org.dimhat.demo7.message.implementor.MessageSMS;

/**
 * 桥接模式
 * <p>
 * 实现抽象成接口，使用类抽象使用
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月24日 下午5:17:42
 */
public class Main {

	public static void main(String[] args) {
		MessageImplementor impl1 = new MessageSMS();
		AbstractMessage m1 = new CommonMessage(impl1);
		m1.sendMessage("消息1", "自己");
		AbstractMessage m2 = new UrgencyMessage(impl1);
		m2.sendMessage("消息2", "自己");
		//
		MessageImplementor impl2 = new MessageEmail();
		AbstractMessage m3 = new CommonMessage(impl2);
		m3.sendMessage("消息3", "自己");
		AbstractMessage m4 = new UrgencyMessage(impl2);
		m4.sendMessage("消息4", "自己");

	}

}
