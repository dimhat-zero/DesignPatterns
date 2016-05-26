package org.dimhat.demo17.mediator;

import java.util.Hashtable;

import org.dimhat.demo17.colleague.AbstractColleague;

public abstract class AbstractMediator {

	// 中介者肯定需要保持有若干同事的联系方式
	protected Hashtable<String, AbstractColleague> colleagues = new Hashtable<String, AbstractColleague>();

	// 中介者可以动态地与某个同事建立联系
	public void addColleague(AbstractColleague c) {
		this.colleagues.put(c.getName(), c);
	}

	// 中介者也可以动态地撤销与某个同事的联系
	public void deleteColleague(String name) {
		this.colleagues.remove(name);
	}

	public abstract void talk(String self, String name, String words);

	public abstract void talk(String self, String words);

}
