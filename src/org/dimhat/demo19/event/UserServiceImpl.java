package org.dimhat.demo19.event;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
	
	private static List<MyListener> listeners = new ArrayList<>();

	@Override
	public void register(MyListener listener) {
		listeners.add(listener);
	}

	@Override
	public void execute() {
		for (MyListener listener : listeners) {
			listener.execute();
		}
	}

	@Override
	public void login() {
		System.out.println("开始登录");
		execute();
		System.out.println("登录成功");
	}

}
