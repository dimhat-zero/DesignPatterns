package org.dimhat.demo17.mediator;

import java.util.Iterator;

import org.dimhat.demo17.colleague.AbstractColleague;

public class Mediator extends AbstractMediator {

	@Override
	public void talk(String self, String name, String words) {
		System.out.println("[" + self + "]通过中介者，告诉[" + name + "]：[" + words + "]");
		AbstractColleague colleague = colleagues.get(name);
		if (colleague == null) {
			System.out.println("找不到这个人");
			return;
		}
		colleague.reply(self, words);
	}

	@Override
	public void talk(String self, String words) {
		System.out.println("[" + self + "]通过中介者，告诉所有人：[" + words + "]");
		Iterator<AbstractColleague> iterator = colleagues.values().iterator();
		while (iterator.hasNext()) {

			AbstractColleague next = iterator.next();
			if (!next.getName().equals(self)) {
				next.reply(words);
			}

		}
	}

}
