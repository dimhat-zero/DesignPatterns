package org.dimhat.demo19.event;


public class EmailListener implements MyListener {

	@Override
	public void execute() {
		System.out.println("发送email");
	}

}
