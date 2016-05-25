package org.dimhat.demo9;

public class SensitiveFilter extends MessageDecorator {

	public SensitiveFilter(MessageHandler handler) {
		super(handler);
	}

	@Override
	public String filter(String msg) {
		String str = handler.filter(msg);
		return "敏感词过滤[" + str + "]";
	}

}
