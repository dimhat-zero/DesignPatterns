package org.dimhat.demo7.sqlquery.timesheet;

public class LastWeek extends TimeSheet {

	public LastWeek() {
		super("上周");
	}

	@Override
	public String timeSql(String timeField) {
		return "YEARWEEK(t." + timeField + " ,1) = YEARWEEK(DATE_SUB(now(),INTERVAL 1 WEEK),1)";
	}

}
