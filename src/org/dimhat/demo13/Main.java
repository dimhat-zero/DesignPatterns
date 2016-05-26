package org.dimhat.demo13;

/**
 * 职责链
 * <p>
 * 处理部分权限内的事
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月25日 下午5:33:16
 */
public class Main {

	public static void main(String[] args) {
		Handler saler = HandlerFactory.createHandler();
		saler.handle(0.01f);
		saler.handle(0.06f);
		saler.handle(0.15f);
	}

}
