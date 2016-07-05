package org.dimhat.demo19.event;

public class PointListener implements MyListener {

	@Override
	public void execute() {
		System.out.println("增加积分");
	}

}
