package org.dimhat.demo9;

public class HtmlFilter extends MessageDecorator {

	public HtmlFilter(MessageHandler handler) {
		super(handler);
	}

	@Override
	public String filter(String msg) {
		String str = handler.filter(msg);
		return "过滤html[" + str + "]";
	}

}
