package org.dimhat.demo8.menu;

import java.util.List;

public class MenuItem extends MenuComponent {

	public MenuItem(String name) {
		super(name);
	}

	@Override
	public void add(MenuComponent e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(MenuComponent e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isMenu() {
		return false;
	}

	@Override
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<MenuComponent> getChilds() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setChilds(List<MenuComponent> list) {
		throw new UnsupportedOperationException();
	}

}
