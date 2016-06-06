package org.dimhat.demo7.sqlquery.tablestat;

public class InspectQuery extends TableQuery {

	@Override
	protected String querySql() {
		return "SELECT count(*) FROM tinspection t WHERE 1=1";
	}

	@Override
	public boolean isCount() {
		return true;
	}

}
