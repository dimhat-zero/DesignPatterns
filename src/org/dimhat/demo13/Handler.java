package org.dimhat.demo13;

public abstract class Handler {

	protected Handler successor;// 后继者

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public abstract void handle(float discount);
}
