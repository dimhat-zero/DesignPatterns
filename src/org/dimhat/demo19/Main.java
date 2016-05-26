package org.dimhat.demo19;

import org.dimhat.demo19.observer.ConcreteObserver;
import org.dimhat.demo19.observer.Observer;
import org.dimhat.demo19.subject.MyNewsPaper;
import org.dimhat.demo19.subject.NewsPaper;

/**
 * 观察者
 * <p>
 * 订阅，发布
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月26日 下午3:09:05
 */
public class Main {

	public static void main(String[] args) {
		NewsPaper subject = new MyNewsPaper();

		Observer observer1 = new ConcreteObserver("王大爷");// 订阅者
		subject.attach(observer1);
		Observer observer2 = new ConcreteObserver("张大妈");
		subject.attach(observer2);

		subject.send();
	}

}
