package org.dimhat.demo13;

public class CEO extends Handler {

	@Override
	public void handle(float discount) {
		if (discount < 0.2) {
			System.out.println("CEO批准了折扣：" + discount);
		} else {
			System.out.println("CEO拒绝了折扣：" + discount);
		}
	}

}
