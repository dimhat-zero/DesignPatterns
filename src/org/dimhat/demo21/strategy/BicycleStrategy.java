package org.dimhat.demo21.strategy;

public class BicycleStrategy implements TravelStrategy {

	@Override
	public void travelAlgorithm() {
		System.out.println("骑自行车");
	}

}
