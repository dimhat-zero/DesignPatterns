package org.dimhat.demo5;

public class Singleton2 {
	private static Singleton2 instance = new Singleton2();

	/**
	 * 饿汉模式，直接new
	 * 
	 * @return
	 */
	public static Singleton2 getInstance() {
		return instance;
	}

}
