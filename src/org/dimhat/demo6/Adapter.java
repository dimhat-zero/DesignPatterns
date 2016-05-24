package org.dimhat.demo6;

/**
 * 适配器
 */
public class Adapter implements Target {

	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		// get export from adaptee
		adaptee.specificRequest();
		// transfrom
		// import to target
	}

}
