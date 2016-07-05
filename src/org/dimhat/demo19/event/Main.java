package org.dimhat.demo19.event;

/**
 * http://blog.csdn.net/yaerfeng/article/details/27683813
 */
public class Main {

	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		userService.register(new PointListener());
		userService.register(new EmailListener());
		userService.login();
	}
}
