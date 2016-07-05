package org.dimhat.demo19.event;


/**
 * 发布者
 */
public interface UserService {

	void register(MyListener listener);// add to list

	void execute();// for all list, do listener.execute()

	void login();
}
