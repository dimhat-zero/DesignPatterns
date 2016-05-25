package org.dimhat.demo8;

public abstract class Company {

	protected String name;

	public Company(String name) {
		super();
		this.name = name;
	}

	protected abstract void add(Company company);

	protected abstract void remove(Company company);

	protected abstract void display(int depth);
}
