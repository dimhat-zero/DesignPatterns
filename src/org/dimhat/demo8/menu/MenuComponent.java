package org.dimhat.demo8.menu;

import java.util.List;

public abstract class MenuComponent {

	private String name;

	public MenuComponent(String name) {
		super();
		this.name = name;
	}

	public abstract void add(MenuComponent e);

	public abstract void remove(MenuComponent e);

	public abstract boolean isMenu();

	public abstract MenuComponent getChild(int i);

	public abstract List<MenuComponent> getChilds();

	public abstract void setChilds(List<MenuComponent> list);

	private void display(String prefix) {
		System.out.println(prefix + name);
		if (isMenu()) {
			for (MenuComponent mc : getChilds()) {
				mc.display(getSpace(prefix.length()) + "|--");
			}
		}
	}

	private String getSpace(int len) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++)
			sb.append(' ');
		return sb.toString();
	}

	public void display() {
		display("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
