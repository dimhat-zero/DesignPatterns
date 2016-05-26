package org.dimhat.demo16;

import java.util.ArrayList;
import java.util.List;

import org.dimhat.demo16.aggregate.Page;
import org.dimhat.demo16.iterator.Iterator;

/**
 * 迭代器
 * <p>
 * 顺序访问，无需暴露内部结构
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月26日 上午10:15:59
 */
public class Main {

	public static void main(String[] args) {
		Page<String> page = new Page<String>();
		List<String> strs = new ArrayList<String>();
		strs.add("aaa");
		strs.add("bbb");
		strs.add("ccc");
		page.setList(strs);

		Iterator<String> iterator = page.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + "--");
		}
	}
}
