package org.dimhat.demo21;

import org.dimhat.demo21.strategy.TravelStrategy;

public class PersonContext {

	private TravelStrategy strategy;

	public void setStrategy(TravelStrategy strategy) {
		this.strategy = strategy;
	}

	public void travel() {
		System.out.println("开始旅行：");
		strategy.travelAlgorithm();
	}

}
