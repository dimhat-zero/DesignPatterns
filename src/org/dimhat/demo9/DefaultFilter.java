package org.dimhat.demo9;

public class DefaultFilter implements MessageHandler {

	@Override
	public String filter(String msg) {
		return "处理[" + msg + "]";
	}

}
