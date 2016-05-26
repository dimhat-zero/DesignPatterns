package org.dimhat.demo18;

//原发器
public class Originator {
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// 创建备忘录
	public Memento createMemento() {
		return new Memento(this.state);
	}

	// 恢复到备忘录
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}
}
