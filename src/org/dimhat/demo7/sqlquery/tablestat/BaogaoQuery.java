package org.dimhat.demo7.sqlquery.tablestat;

public class BaogaoQuery extends TableQuery {

	@Override
	protected String querySql() {
		return "SELECT count(*) FROM tinspection t where t.status>=5";
	}

	@Override
	public boolean isCount() {
		return true;
	}

}
