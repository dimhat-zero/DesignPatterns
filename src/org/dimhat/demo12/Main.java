package org.dimhat.demo12;

/**
 * 代理
 * <p>
 * 交给代理对象处理
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月25日 下午5:19:12
 */
public class Main {

	public static void main(String[] args) {
		Subject subject1 = new RealSubject();
		subject1.operation();

		Subject subject2 = new Proxy();
		subject2.operation();
	}

}
