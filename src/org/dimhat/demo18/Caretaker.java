package org.dimhat.demo18;

//负责人（保存备忘录对象）
public class Caretaker {

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
