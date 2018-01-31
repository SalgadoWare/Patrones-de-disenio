package interpreter.ast.nodes;

import interpreter.Visitor;

public class Assignment implements Statement 
{
	private Variable variable;
	private Expression expression;

	public Assignment(Variable variable, Expression expression) 
	{
		this.setVariable(variable);
		this.setExpression(expression);
	}

	@Override
	public Object accept(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return v.visit(this,o);
	}

	public Variable getVariable() {
		return variable;
	}

	public void setVariable(Variable variable) {
		this.variable = variable;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}
}
