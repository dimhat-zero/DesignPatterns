package org.dimhat.demo5;

public class Singleton {

	private static Singleton instance;

	/**
	 * 懒汉模式，要加同步关键字才能线程安全 用到才创建，所以懒
	 * 
	 * @return
	 */
	public static synchronized Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
}
