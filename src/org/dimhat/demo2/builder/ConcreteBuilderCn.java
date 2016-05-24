package org.dimhat.demo2.builder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.dimhat.demo2.product.PanelProduct;

public class ConcreteBuilderCn implements Builder {

	private PanelProduct panel;

	public ConcreteBuilderCn() {
		panel = new PanelProduct();
	}

	@Override
	public void buildButton() {
		panel.button = new JButton("按钮");
	}

	@Override
	public void buildLabel() {
		panel.label = new JLabel("标签");
	}

	@Override
	public void buildTextField() {
		panel.textField = new JTextField("文本");
	}

	@Override
	public JPanel getPanel() {
		panel.add(panel.button);
		panel.add(panel.label);
		panel.add(panel.textField);
		return panel;
	}

}
