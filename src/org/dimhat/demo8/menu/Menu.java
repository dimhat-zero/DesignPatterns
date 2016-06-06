package org.dimhat.demo8.menu;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

	public Menu(String name) {
		super(name);
	}

	private List<MenuComponent> childs = new ArrayList<>();

	@Override
	public void add(MenuComponent e) {
		childs.add(e);
	}

	@Override
	public void remove(MenuComponent e) {
		childs.remove(e);
	}

	@Override
	public boolean isMenu() {
		return true;
	}

	@Override
	public MenuComponent getChild(int i) {
		return childs.get(i);
	}

	@Override
	public List<MenuComponent> getChilds() {
		return childs;
	}

	@Override
	public void setChilds(List<MenuComponent> list) {
		this.childs = list;
	}

}
