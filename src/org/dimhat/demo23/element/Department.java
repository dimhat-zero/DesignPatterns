package org.dimhat.demo23.element;

import org.dimhat.demo23.visitor.Visitor;

//Element
public abstract class Department {

	public abstract void accept(Visitor visitor);

	// 检查
	public abstract void business();

	// 业务
	public abstract void check();

}
