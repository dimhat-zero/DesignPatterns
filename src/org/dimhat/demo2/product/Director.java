package org.dimhat.demo2.product;

import javax.swing.JPanel;

import org.dimhat.demo2.builder.Builder;



public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public JPanel constructProduct() {
		builder.buildButton();
		builder.buildLabel();
		builder.buildTextField();
		return builder.getPanel();
	}
}
