package org.dimhat.demo7.message.abstraction;

import org.dimhat.demo7.message.implementor.MessageImplementor;

/**
 * 抽象的消息对象，abstract
 */
public abstract class AbstractMessage {

	private MessageImplementor impl;

	public AbstractMessage(MessageImplementor impl) {
		super();
		this.impl = impl;
	}

	public void sendMessage(String message, String toUser) {
		this.impl.send(message, toUser);
	}
}
