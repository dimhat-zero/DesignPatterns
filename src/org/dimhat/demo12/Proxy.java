package org.dimhat.demo12;

public class Proxy implements Subject {

	private Subject subject = new RealSubject();

	@Override
	public void operation() {
		System.out.println("do somethnig proxy");
		subject.operation();
	}

}
