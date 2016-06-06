package org.dimhat.demo7.artpen;

public class WriteBrushes implements Pen {

	@Override
	public void draw() {
		System.out.println("产生一副毛笔字");
	}

	@Override
	public String getName() {
		return "毛笔";
	}

}
