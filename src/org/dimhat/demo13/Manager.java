package org.dimhat.demo13;

public class Manager extends Handler {

	@Override
	public void handle(float discount) {
		if (discount < 0.1) {
			System.out.println("Manager批准了折扣：" + discount);
		} else {
			successor.handle(discount);
		}
	}

}
