package org.dimhat.demo17;

import org.dimhat.demo17.colleague.AbstractColleague;
import org.dimhat.demo17.colleague.Boss;
import org.dimhat.demo17.colleague.Colleague;
import org.dimhat.demo17.mediator.AbstractMediator;
import org.dimhat.demo17.mediator.Mediator;

/**
 * 中介者
 * <p>
 * 通过第三方传递
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月26日 下午1:05:19
 */
public class Main {

	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();

		AbstractColleague boss = new Boss("老板");
		AbstractColleague c1 = new Colleague("小王");
		AbstractColleague c2 = new Colleague("小李");

		mediator.addColleague(boss);
		mediator.addColleague(c1);
		mediator.addColleague(c2);

		boss.setMediator(mediator);
		c1.setMediator(mediator);
		c2.setMediator(mediator);
		boss.send("今天下午开会");
		boss.send("小王", "开完会留一下");
		boss.send("小3", "开完会留一下");
	}

}
