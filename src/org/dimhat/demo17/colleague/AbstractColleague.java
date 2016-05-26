package org.dimhat.demo17.colleague;

import org.dimhat.demo17.mediator.AbstractMediator;

public abstract class AbstractColleague {

	protected String name;

	public String getName() {
		return name;
	}

	protected AbstractMediator mediator;

	public AbstractColleague(String name) {
		super();
		this.name = name;
	}

	public void setMediator(AbstractMediator mediator) {
		this.mediator = mediator;
	}

	public abstract void send(String name, String words);

	public abstract void send(String words);

	public abstract void reply(String name, String words);

	public abstract void reply(String words);

}
