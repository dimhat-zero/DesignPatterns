package org.dimhat.demo7.sqlquery.timesheet;

public class Yesterday extends TimeSheet {

	public Yesterday() {
		super("昨天");
	}


	@Override
	public String timeSql(String timeField) {
		return "TO_DAYS(t." + timeField + ") = TO_DAYS(CURDATE())-1";
	}

}
