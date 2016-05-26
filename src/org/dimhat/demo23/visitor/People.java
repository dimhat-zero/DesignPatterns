package org.dimhat.demo23.visitor;

import org.dimhat.demo23.element.GovDepartment;
import org.dimhat.demo23.element.PriDepartment;

public class People implements Visitor {

	@Override
	public void visit(GovDepartment e) {
		System.out.println("普通人访问：");
		e.business();
	}

	@Override
	public void visit(PriDepartment e) {
		System.out.println("普通人访问：");
		e.check();
	}

}
