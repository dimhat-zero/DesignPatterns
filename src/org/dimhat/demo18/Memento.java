package org.dimhat.demo18;

//备忘录（对负责人和原发器之外不可见）
public class Memento {
	private String state = "";

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
