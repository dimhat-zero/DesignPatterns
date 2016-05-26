package org.dimhat.demo19.subject;

import java.util.ArrayList;
import java.util.List;

import org.dimhat.demo19.observer.Observer;


public class MyNewsPaper implements NewsPaper {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void send() {
		for(Observer observer : observers){
			observer.receive();
		}
	}

}
