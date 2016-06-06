package org.dimhat.demo7.sqlquery.timesheet;

public class LastMonth extends TimeSheet {

	public LastMonth() {
		super("上月");
	}



	@Override
	public String timeSql(String timeField) {
		return "date_format(t." + timeField + " ,'%Y-%m')=date_format(DATE_SUB(now(),INTERVAL 1 MONTH),'%Y-%m')";
	}

}
