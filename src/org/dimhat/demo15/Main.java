package org.dimhat.demo15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 解释器
 * 
 * @author dimhat
 * @date 2016年5月26日 上午9:36:45
 */
public class Main {

	public static void main(String[] args) throws IOException {
		String expStr = getExpStr();

		// 赋值
		HashMap<String, Integer> var = getValue(expStr);// 变量=>值 对
		Calculator cal = new Calculator(expStr);
		System.out.println("运算结果为：" + expStr + "=" + cal.run(var));

	}

	// 获得表达式 a+b-c 单字符变量
	public static String getExpStr() throws IOException {
		System.out.print("请输入表达式：");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}

	// 获得值映射
	// 获得变量的 具体值
	public static HashMap<String, Integer> getValue(String exprStr) throws IOException {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// 解析有几个参数要传递
		for (char ch : exprStr.toCharArray()) {
			if (ch != '+' && ch != '-') {
				// 解决重复参数的问题
				if (!map.containsKey(String.valueOf(ch))) {
					System.out.print("请输入" + ch + "的值:");
					String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}

		return map;
	}

}