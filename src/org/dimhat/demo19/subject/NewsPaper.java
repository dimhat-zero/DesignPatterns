package org.dimhat.demo19.subject;

import org.dimhat.demo19.observer.Observer;

//发布者 subject
public interface NewsPaper {

	// 增加订阅
	void attach(Observer observer);

	// 删除订阅
	void detach(Observer observer);

	// 发送报纸
	void send();

}
