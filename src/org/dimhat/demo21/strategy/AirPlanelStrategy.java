package org.dimhat.demo21.strategy;

public class AirPlanelStrategy implements TravelStrategy {

	@Override
	public void travelAlgorithm() {
		System.out.println("坐飞机");
	}

}
