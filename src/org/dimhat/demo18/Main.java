package org.dimhat.demo18;

/**
 * 备忘录
 * <p>
 * 恢复状态
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月26日 下午2:07:11
 */
public class Main {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("状态1");
		System.out.println("初始状态:" + originator.getState());
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		originator.setState("状态2");
		System.out.println("改变后状态:" + originator.getState());
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("恢复后状态:" + originator.getState());
	}

}
