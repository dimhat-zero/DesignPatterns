package org.dimhat.demo19.observer;


public class ConcreteObserver implements Observer {

	private String name;

	public ConcreteObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void receive() {
		System.out.println(name + " 接收到报纸");
	}

}
