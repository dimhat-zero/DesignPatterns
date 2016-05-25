package org.dimhat.demo9;


public abstract class MessageDecorator implements MessageHandler {

	protected MessageHandler handler;

	public MessageDecorator(MessageHandler handler) {
		super();
		this.handler = handler;
	}

	public abstract String filter(String msg);

}
