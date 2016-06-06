package org.dimhat.demo8.menu;

/**
 * 组合模式——菜单
 * 
 * @author dimhat
 * @date 2016年5月27日 下午1:17:11
 */
public class Main {

	public static void main(String[] args) {
		MenuComponent root = new Menu("根菜单");
		MenuComponent menu1 = new Menu("菜单1");
		root.add(menu1);
		root.add(new MenuItem("菜单项1"));
		
		MenuComponent menu2 = new Menu("菜单2");
		menu1.add(menu2);
		menu1.add(new MenuItem("菜单项2"));

		menu2.add(new MenuItem("菜单项3"));

		root.display();
	}

}
