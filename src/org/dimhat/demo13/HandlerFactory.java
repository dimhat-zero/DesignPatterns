package org.dimhat.demo13;

public class HandlerFactory {

	public static Handler createHandler() {
		Handler saler = new Saler();
		Handler manager = new Manager();
		Handler ceo = new CEO();
		saler.setSuccessor(manager);
		manager.setSuccessor(ceo);
		return saler;
	}
}
