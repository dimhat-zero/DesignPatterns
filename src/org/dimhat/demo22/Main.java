package org.dimhat.demo22;

/**
 * 模板方法
 * <p>
 * 事情顺序相同
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月26日 下午4:28:04
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		LoginTemplate loginTemplate = new LoginTemplate();
		loginTemplate.setUsername("admin");
		// loginTemplate.sendRequest();
		loginTemplate.setPassword("123");
		loginTemplate.sendRequest();

		LogoutTemplate logoutTemplate = new LogoutTemplate();
		logoutTemplate.setSessionId("0xfff");
		logoutTemplate.sendRequest();
	}

}
