package org.dimhat.demo21.strategy;

public class TrainStrategy implements TravelStrategy {

	@Override
	public void travelAlgorithm() {
		System.out.println("坐火车");
	}

}
