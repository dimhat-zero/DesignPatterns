package org.dimhat.demo10;

public class Facade {

	private Door door;
	private Light light;
	private Window window;

	public Facade(Door door, Light light, Window window) {
		super();
		this.door = door;
		this.light = light;
		this.window = window;
	}

	public Facade() {
		this.door = new Door();
		this.light = new Light();
		this.window = new Window();
	}

	public void leave() {
		window.close();
		light.trunOff();
		door.close();
	}

	public void enter() {
		door.open();
		light.trunOn();
		window.open();
	}

}
