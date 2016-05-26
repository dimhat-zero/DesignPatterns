package org.dimhat.demo23.visitor;

import org.dimhat.demo23.element.GovDepartment;
import org.dimhat.demo23.element.PriDepartment;

public interface Visitor {
	public void visit(GovDepartment e);

	public void visit(PriDepartment e);
}
