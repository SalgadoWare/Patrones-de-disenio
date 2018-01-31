package interpreter.ast.nodes;

import interpreter.Visitor;

public class Division implements Expression {
	private Expression left, right;

	public Division(Expression left, Expression right) {
		this.setLeft(left);
		this.setRight(right);
	}

	@Override
	public Object accept(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return v.visit(this,o);
	}

	public Expression getLeft() {
		return left;
	}

	public void setLeft(Expression left) {
		this.left = left;
	}

	public Expression getRight() {
		return right;
	}

	public void setRight(Expression right) {
		this.right = right;
	}

}
