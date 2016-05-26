package org.dimhat.demo23.element;

import org.dimhat.demo23.visitor.Leader;
import org.dimhat.demo23.visitor.Visitor;

//民营部门
public class PriDepartment extends Department {


	public void accept(Visitor visitor) {
		if (visitor instanceof Leader) {
			System.out.println("领导来了，快准备！");
		}
		visitor.visit(this);
	}


	@Override
	public void business() {
		System.out.println("民营部门办理业务");
	}

	@Override
	public void check() {
		System.out.println("民营部门进行检查");
	}
}
