package org.dimhat.demo9;

/**
 * 装饰
 * <p>
 * 添加额外职责
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月25日 下午1:13:27
 */
public class Main {

	public static void main(String[] args) {
		String msg = "今天天气真好";
		MessageHandler handler = new DefaultFilter();
		System.out.println(handler.filter(msg));

		MessageHandler htmlHandler = new HtmlFilter(handler);
		System.out.println(htmlHandler.filter(msg));

		MessageHandler senHandler = new SensitiveFilter(handler);
		System.out.println(senHandler.filter(msg));

		MessageHandler senHandler2 = new SensitiveFilter(htmlHandler);
		System.out.println(senHandler2.filter(msg));

	}

}
