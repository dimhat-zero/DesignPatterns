package org.dimhat.demo7.sqlquery.timesheet;

public class Month extends TimeSheet {

	public Month() {
		super("本月");
	}


	@Override
	public String timeSql(String timeField) {
		return "date_format(t." + timeField + " ,'%Y-%m')=date_format(now(),'%Y-%m')";
	}

}
