package org.dimhat.demo14;

/**
 * 命令
 * <p>
 * 回调函数替代品
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月26日 上午9:04:51
 */
public class Main {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		// 客户端直接执行具体命令方式（此方式与类图相符）
		command.execute();

		// 客户端通过调用者来执行命令
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.action();
	}

}
