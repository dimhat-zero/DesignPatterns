package org.dimhat.demo19.observer;

//观察者，订阅方
public interface Observer {

	// 发布者通知接口
	public void receive();
}
