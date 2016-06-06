package org.dimhat.demo7.sqlquery.timesheet;

public class Week extends TimeSheet {

	public Week() {
		super("本周");
	}


	@Override
	public String timeSql(String timeField) {
		return "YEARWEEK(t." + timeField + " ,1) = YEARWEEK(now(),1);";
	}

}
