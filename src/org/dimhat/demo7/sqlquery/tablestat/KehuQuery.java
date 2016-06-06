package org.dimhat.demo7.sqlquery.tablestat;

public class KehuQuery extends TableQuery {

	public KehuQuery() {
		super();
		setTimeField("regist_time");
	}

	@Override
	protected String querySql() {
		return "SELECT count(*) FROM organization t WHERE t.type=3";
	}

	@Override
	public boolean isCount() {
		return true;
	}

}
