package org.dimhat.demo15.expression;

import java.util.HashMap;

//变量表达式
public class VarExpression extends Expression {

	private String key;

	public VarExpression(String key) {
		super();
		this.key = key;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);// 返回变量的值
	}

}
