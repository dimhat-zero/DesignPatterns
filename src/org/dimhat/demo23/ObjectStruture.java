package org.dimhat.demo23;

import java.util.ArrayList;
import java.util.List;

import org.dimhat.demo23.element.Department;
import org.dimhat.demo23.element.GovDepartment;
import org.dimhat.demo23.element.PriDepartment;

//对象结构
public class ObjectStruture {

	// 所有部门
	public static List<Department> getList() {
		List<Department> list = new ArrayList<Department>();
		list.add(new GovDepartment());
		list.add(new PriDepartment());
		return list;
	}
}
