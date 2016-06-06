package org.dimhat.demo7.artpen;

public abstract class Artist {

	private String name;

	public Artist(String name) {
		super();
		this.name = name;
	}

	private Pen pen;

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	// 进行创作
	public void create() {
		System.out.println(name + "拿着[" + pen.getName() + "]进行创作");
		pen.draw();
	}
}
