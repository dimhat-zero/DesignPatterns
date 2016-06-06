package org.dimhat.demo7.sqlquery.tablestat;

public class CaiwuQuery extends TableQuery {

	@Override
	protected String querySql() {
		return "SELECT sum(real_fee) FROM tinspection t where 1=1";
	}

	@Override
	public boolean isCount() {
		return true;
	}

}
