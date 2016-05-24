package org.dimhat.demo3.product;


public class BookProduct implements Product {

	@Override
	public void name() {
		System.out.println("名称：设计模式");
	}

	@Override
	public void type() {
		System.out.println("类别：书本");
	}

}
