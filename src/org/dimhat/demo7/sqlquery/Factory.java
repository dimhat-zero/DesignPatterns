package org.dimhat.demo7.sqlquery;

import java.util.ArrayList;
import java.util.List;

import org.dimhat.demo7.sqlquery.tablestat.BaogaoQuery;
import org.dimhat.demo7.sqlquery.tablestat.CaiwuQuery;
import org.dimhat.demo7.sqlquery.tablestat.InspectQuery;
import org.dimhat.demo7.sqlquery.tablestat.KehuQuery;
import org.dimhat.demo7.sqlquery.tablestat.OrderQuery;
import org.dimhat.demo7.sqlquery.tablestat.ShenheQuery;
import org.dimhat.demo7.sqlquery.tablestat.TableQuery;
import org.dimhat.demo7.sqlquery.timesheet.LastMonth;
import org.dimhat.demo7.sqlquery.timesheet.LastWeek;
import org.dimhat.demo7.sqlquery.timesheet.Month;
import org.dimhat.demo7.sqlquery.timesheet.TimeSheet;
import org.dimhat.demo7.sqlquery.timesheet.Today;
import org.dimhat.demo7.sqlquery.timesheet.Week;
import org.dimhat.demo7.sqlquery.timesheet.Yesterday;

public class Factory {

	private static List<TableQuery> tableQuerys = new ArrayList<>();

	static {
		tableQuerys.add(new OrderQuery());
		tableQuerys.add(new InspectQuery());
		tableQuerys.add(new ShenheQuery());
		tableQuerys.add(new CaiwuQuery());
		tableQuerys.add(new BaogaoQuery());
		tableQuerys.add(new KehuQuery());
	}

	public static List<TableQuery> getTableQuerys() {

		return tableQuerys;
	}
	
	private static List<TimeSheet> timeSheets = new ArrayList<>();
	static{
		timeSheets.add(new Today());
		timeSheets.add(new Yesterday());
		timeSheets.add(new Week());
		timeSheets.add(new LastWeek());
		timeSheets.add(new Month());
		timeSheets.add(new LastMonth());
	}
	
	public static List<TimeSheet> getTimeSheets() {
		
		return timeSheets;
	}
}
