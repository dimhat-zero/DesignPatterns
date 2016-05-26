package org.dimhat.demo17.colleague;

public class Boss extends AbstractColleague {

	public Boss(String name) {
		super(name);
	}

	@Override
	public void send(String name, String words) {
		mediator.talk(this.name, name, words);
	}

	@Override
	public void send(String words) {
		mediator.talk(this.name, words);
	}

	@Override
	public void reply(String name, String words) {
		System.out.println("[" + this.name + "]收到[" + name + "]：[" + words + "]");
	}

	@Override
	public void reply(String words) {
		System.out.println("[" + this.name + "]收到：[" + words + "]");
	}

}
