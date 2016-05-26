package org.dimhat.demo22;

public class LogoutTemplate extends AbstractTemplate {

	private String sessionId;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	protected void checkParams() {
		System.out.println("开始参数校验");
		if (sessionId == null) {
			throw new IllegalArgumentException("session id不为空");
		}
		System.out.println("通过参数校验");
	}

	@Override
	protected void handler(String result) {
		if ("success".equals(result)) {
			System.out.println("退出成功！");
		} else {
			System.out.println("退出失败，请检查网络");
		}
	}

}
