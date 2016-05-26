package org.dimhat.demo20;

import org.dimhat.demo20.state.ConcreteStateB;
import org.dimhat.demo20.state.State;

/**
 * 状态
 * <p>
 * 处于不同状态下，处理不同<br/>
 * 比如vip购买打折
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月26日 下午3:55:28
 */
public class Main {

	public static void main(String[] args) {
		// 创建状态
		State state = new ConcreteStateB();
		// 创建环境
		Context context = new Context();
		// 将状态设置到环境中
		context.setState(state);
		// 请求
		context.request("test");
	}

}
