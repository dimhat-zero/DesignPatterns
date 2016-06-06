package org.dimhat.demo7.sqlquery.tablestat;

import org.dimhat.demo7.sqlquery.timesheet.TimeSheet;

/**
 * 表数据统计
 */
public abstract class TableQuery {

	private String timeField = "create_time";

	private TimeSheet timeSheet;// 查询时间段

	protected abstract String querySql();

	public abstract boolean isCount();// 是否count查询，否则是sum查询

	public String executeSql() {
		StringBuilder sql = new StringBuilder();
		sql.append(querySql()).append(" AND ").append(timeSheet.timeSql(timeField));
		return sql.toString();
	}

	protected void setTimeField(String timeField) {
		this.timeField = timeField;
	}

	public void setTimeSheet(TimeSheet timeSheet) {
		this.timeSheet = timeSheet;
	}

}
