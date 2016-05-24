package org.dimhat.demo2.builder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.dimhat.demo2.product.PanelProduct;

public class ConcreteBuilderEn implements Builder {

	private PanelProduct panel;

	public ConcreteBuilderEn() {
		panel = new PanelProduct();
	}

	@Override
	public void buildButton() {
		panel.button = new JButton("button");
	}

	@Override
	public void buildLabel() {
		panel.label = new JLabel("lable");
	}

	@Override
	public void buildTextField() {
		panel.textField = new JTextField("text");
	}

	@Override
	public JPanel getPanel() {
		panel.add(panel.button);
		panel.add(panel.label);
		panel.add(panel.textField);
		return panel;
	}
}
