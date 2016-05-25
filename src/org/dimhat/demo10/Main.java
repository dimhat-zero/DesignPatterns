package org.dimhat.demo10;

/**
 * 外观者模式
 * <p>
 * 为一组接口提供一致的界面 集成一下
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月25日 下午3:28:30
 */
public class Main {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.leave();
		System.out.println("============");
		facade.enter();

	}

}
