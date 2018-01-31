package interpreter;

import interpreter.ast.nodes.Assignment;
import interpreter.ast.nodes.Division;
import interpreter.ast.nodes.IntegerLiteral;
import interpreter.ast.nodes.Print;
import interpreter.ast.nodes.Product;
import interpreter.ast.nodes.Program;
import interpreter.ast.nodes.Read;
import interpreter.ast.nodes.Statement;
import interpreter.ast.nodes.Sum;
import interpreter.ast.nodes.Variable;

public class PrintVisitor implements Visitor {

	@Override
	public Object visit(Assignment assignment, Object o) {
		assignment.getVariable().accept(this, null);
		System.out.print(" = ");
		assignment.getExpression().accept(this, null);
		sysoEnd();
		return null;
	}

	@Override
	public Object visit(Division division, Object o) {
		division.getLeft().accept(this, o);
		System.out.print(" / ");
		division.getRight().accept(this, o);
		return null;
	}

	@Override
	public Object visit(IntegerLiteral integerLiteral, Object o) {
		System.out.print(" " + integerLiteral.value+ " ");
		return null;
	}

	@Override
	public Object visit(Print print, Object o) {
		System.out.print("Print ");
		print.expression.accept(this, o);
		sysoEnd();
		return null;
	}
	
	private void sysoEnd() {
		System.out.print(";");
		System.out.println();
	}

	@Override
	public Object visit(Product product, Object o) {
		product.left.accept(this, o);
		System.out.print(" * ");
		product.right.accept(this, o);
		return null;
	}

	@Override
	public Object visit(Program program, Object o) {
		for(Statement s : program.statements)
			s.accept(this, o);
		return null;
	}

	@Override
	public Object visit(Read read, Object o) {
		System.out.print("Read ");
		read.variable.accept(this, o);
		sysoEnd();
		return null;
	}

	@Override
	public Object visit(Sum sum, Object o) {
		sum.left.accept(this, o);
		System.out.print(" + ");
		sum.right.accept(this, o);
		return null;
	}

	@Override
	public Object visit(Variable variable, Object o) {
		System.out.print(" " +variable.name +" ");
		return null;
	}
}
