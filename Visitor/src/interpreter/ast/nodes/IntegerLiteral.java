package interpreter.ast.nodes;

import interpreter.Visitor;

public class IntegerLiteral implements Expression 
{
	public String value;

	public IntegerLiteral(String value) 
	{
		this.value = value;
	}

	@Override
	public Object accept(Visitor v, Object o) {
		// TODO Auto-generated method stub
		return v.visit(this, o);
	}
}
