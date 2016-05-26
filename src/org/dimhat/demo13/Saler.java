package org.dimhat.demo13;

public class Saler extends Handler {

	@Override
	public void handle(float discount) {
		if (discount < 0.05) {
			System.out.println("Saler批准折扣：" + discount);
		} else {
			successor.handle(discount);
		}
	}

}
