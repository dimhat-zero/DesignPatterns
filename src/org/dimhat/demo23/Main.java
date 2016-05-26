package org.dimhat.demo23;

import java.util.List;

import org.dimhat.demo23.element.Department;
import org.dimhat.demo23.visitor.Leader;
import org.dimhat.demo23.visitor.People;
import org.dimhat.demo23.visitor.Visitor;

/**
 * 访问者
 * <p>
 * 元素.accept(访问者) => 访问者.visit(元素本身) => 元素.method() <br/>
 * 
 * 元素提供基本功能，访问者决定如何调用
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月26日 下午5:12:46
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		List<Department> list = ObjectStruture.getList();
		Visitor leader = new Leader();
		Visitor people = new People();
		for (Department e : list) {
			e.accept(leader);
			e.accept(people);
		}
	}

}
