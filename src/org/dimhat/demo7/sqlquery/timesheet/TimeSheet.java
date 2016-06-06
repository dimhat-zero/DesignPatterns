package org.dimhat.demo7.sqlquery.timesheet;

/**
 * 时间段
 */
public abstract class TimeSheet {

	private String name;

	public TimeSheet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// 得到时间sql
	public abstract String timeSql(String timeField);

}
