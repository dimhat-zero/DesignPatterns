package org.dimhat.demo20.state;

public class ConcreteStateB implements State {

	@Override
	public void handle(String sampleParameter) {
		System.out.println("ConcreteStateB handle ：" + sampleParameter);
	}

}

