package org.dimhat.demo15.expression;

//符号表达式
public abstract class SymbolExpression extends Expression {

	protected Expression left;

	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}

}
