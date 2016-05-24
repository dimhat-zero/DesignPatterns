package org.dimhat.demo2.builder;

import javax.swing.JPanel;

public interface Builder {

	void buildButton();

	void buildLabel();

	void buildTextField();

	JPanel getPanel();
}
