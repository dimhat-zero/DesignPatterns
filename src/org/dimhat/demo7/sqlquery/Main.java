package org.dimhat.demo7.sqlquery;

import java.util.List;

import org.dimhat.demo7.sqlquery.tablestat.TableQuery;
import org.dimhat.demo7.sqlquery.timesheet.TimeSheet;

/**
 * 桥接模式
 * 
 * @author dimhat
 * @date 2016年5月27日 下午1:37:37
 */
public class Main {

	public static void main(String[] args) {
		// build table query
		List<TableQuery> tableQuerys = Factory.getTableQuerys();

		// build time sheet
		List<TimeSheet> timeSheets = Factory.getTimeSheets();

		// build real sql
		for (TableQuery tableQuery : tableQuerys) {
			for (TimeSheet timeSheet : timeSheets) {
				tableQuery.setTimeSheet(timeSheet);
				System.out.println(tableQuery.executeSql());
			}
		}
	}

}
