package org.dimhat.demo7.artpen;

//画笔
public class Paintbrushes implements Pen {

	@Override
	public void draw() {
		System.out.println("产生一副画");
	}

	@Override
	public String getName() {
		return "画笔";
	}

}
