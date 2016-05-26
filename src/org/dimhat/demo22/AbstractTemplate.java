package org.dimhat.demo22;

public abstract class AbstractTemplate {

	// 模板方法
	public void sendRequest() {
		checkParams();
		sign();
		String result = send();
		handler(result);
	}

	// 校验参数
	protected abstract void checkParams();

	// 参数签名
	private final void sign() {
		System.out.println("进行md5签名");
	}

	// 发送请求
	private final String send() {
		System.out.println("发送请求到服务器");
		return "success";
	}

	// 处理结果
	protected abstract void handler(String result);
}
