package org.dimhat.demo8.company;

public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	protected void add(Company company) {

	}

	@Override
	protected void remove(Company company) {

	}

	@Override
	protected void display(int depth) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < depth; i++) {
			sb.append("-");
		}
		System.out.println(sb.toString() + this.name);
	}

}
