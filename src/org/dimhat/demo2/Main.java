package org.dimhat.demo2;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.dimhat.demo2.builder.Builder;
import org.dimhat.demo2.builder.ConcreteBuilderCn;
import org.dimhat.demo2.builder.ConcreteBuilderEn;
import org.dimhat.demo2.product.Director;

/**
 * 生成器模式，将构造代码和表示代码分开
 * <p>
 * 简化产品的构造组合过程<br/>
 * 和抽象工厂都可以创建复杂对象，主要区别是build模式着重一步步构造一个复杂对象，而Abstract Factory着重多个系列的产品对象
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月23日 下午6:05:46
 */
public class Main {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilderCn();
		Director dir = new Director(builder);
		JPanel panel = dir.constructProduct();
		JFrame frameCn = new JFrame("你好");
		Container con = frameCn.getContentPane();
		con.add(panel);
		frameCn.setBounds(12, 12, 200, 120);
		frameCn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCn.setVisible(true);

		builder = new ConcreteBuilderEn();
		dir = new Director(builder);
		panel = dir.constructProduct();
		JFrame frameEn = new JFrame("hello");
		con = frameEn.getContentPane();
		con.add(panel);
		frameEn.setBounds(222, 12, 200, 120);
		frameEn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameEn.setVisible(true);
	}

}
