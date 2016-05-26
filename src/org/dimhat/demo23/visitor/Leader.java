package org.dimhat.demo23.visitor;

import org.dimhat.demo23.element.GovDepartment;
import org.dimhat.demo23.element.PriDepartment;

//访问者
public class Leader implements Visitor {

	@Override
	public void visit(GovDepartment e) {
		System.out.println("领导访问：");
		e.check();
	}

	@Override
	public void visit(PriDepartment e) {
		System.out.println("领导访问：");
		e.business();
	}

}
