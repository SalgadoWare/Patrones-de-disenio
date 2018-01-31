package interpreter;

import java.io.Reader;
import java.util.HashMap;
import java.util.Scanner;

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

public class ExecuteVisitor implements Visitor {

	private Scanner sc = new Scanner(System.in);
	private HashMap<String, Integer> map = new HashMap<>();

	@Override
	public Object visit(Assignment assignment, Object o) {
		Integer resultado = (Integer) assignment.getExpression().accept(this, o);
		map.put(assignment.getVariable().name, resultado);
		return null;
	}

	@Override
	public Object visit(Division division, Object o) {
		Integer left = (Integer) division.getLeft().accept(this, o);
		Integer right = (Integer) division.getRight().accept(this, o);
		return left / right;
	}

	@Override
	public Object visit(IntegerLiteral integerLiteral, Object o) {
		return Integer.parseInt(integerLiteral.value);
	}

	@Override
	public Object visit(Print print, Object o) {
		Integer resultado = (Integer) print.expression.accept(this, o);
		System.out.println(resultado);
		return null;
	}

	@Override
	public Object visit(Product product, Object o) {
		Integer left = (Integer) product.left.accept(this, o);
		Integer right = (Integer) product.right.accept(this, o);
		return left * right;
	}

	@Override
	public Object visit(Program program, Object o) {
		for (Statement st : program.statements)
			st.accept(this, o);
		return null;
	}

	@Override
	public Object visit(Read read, Object o) {
		map.put(read.variable.name, sc.nextInt());
		return null;
	}

	@Override
	public Object visit(Sum sum, Object o) {
		Integer left = (Integer) sum.left.accept(this, o);
		Integer right = (Integer) sum.right.accept(this, o);
		return left + right;
	}

	@Override
	public Object visit(Variable variable, Object o) {
		return map.get(variable.name);
	}

}
