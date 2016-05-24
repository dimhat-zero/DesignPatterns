package org.dimhat.demo3.product;


public class AppProduct implements Product {

	@Override
	public void name() {
		System.out.println("名称：微信");
	}

	@Override
	public void type() {
		System.out.println("类别：应用");
	}

}
