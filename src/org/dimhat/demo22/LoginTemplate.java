package org.dimhat.demo22;

public class LoginTemplate extends AbstractTemplate {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	protected void checkParams() {
		System.out.println("开始参数校验");
		if (username == null) {
			throw new IllegalArgumentException("用户名不为空");
		}
		if (password == null) {
			throw new IllegalArgumentException("密码不为空");
		}
		System.out.println("通过参数校验");
	}

	@Override
	protected void handler(String result) {
		if ("success".equals(result)) {
			System.out.println("登录成功！");
		} else {
			System.out.println("用户名或密码错误");
		}
	}

}
