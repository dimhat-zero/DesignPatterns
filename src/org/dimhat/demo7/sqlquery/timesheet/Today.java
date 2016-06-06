package org.dimhat.demo7.sqlquery.timesheet;

public class Today extends TimeSheet {


	public Today() {
		super("今天");
	}


	@Override
	public String timeSql(String timeField) {
		return "TO_DAYS(t." + timeField + ") = TO_DAYS(CURDATE())";
	}

}
