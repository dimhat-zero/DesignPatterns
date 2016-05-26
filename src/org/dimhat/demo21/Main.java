package org.dimhat.demo21;

import org.dimhat.demo21.strategy.BicycleStrategy;

/**
 * 策略
 * <p>
 * 使用不同策略，比如打折方案
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月26日 下午4:08:35
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {

		PersonContext context = new PersonContext();
		context.setStrategy(new BicycleStrategy());
		context.travel();
	}

}
