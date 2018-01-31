package interpreter;

import interpreter.ast.nodes.Assignment;
import interpreter.ast.nodes.Division;
import interpreter.ast.nodes.IntegerLiteral;
import interpreter.ast.nodes.Print;
import interpreter.ast.nodes.Product;
import interpreter.ast.nodes.Program;
import interpreter.ast.nodes.Read;
import interpreter.ast.nodes.Sum;
import interpreter.ast.nodes.Variable;

public interface Visitor {
	Object visit(Assignment assignment, Object o);
	Object visit(Division division, Object o);
	Object visit(IntegerLiteral integerLiteral, Object o);
	Object visit(Print print, Object o);
	Object visit(Product product, Object o);
	Object visit(Program program, Object o);
	Object visit(Read read, Object o);
	Object visit(Sum sum, Object o);
	Object visit(Variable variable, Object o);
}
