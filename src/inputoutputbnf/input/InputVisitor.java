// Generated from Input.g4 by ANTLR 4.13.1
package inputoutputbnf;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InputParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InputVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InputParser#input_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_statement(InputParser.Input_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputParser#scanner_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanner_declaration(InputParser.Scanner_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputParser#input_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_expression(InputParser.Input_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputParser#solitary_input_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolitary_input_expression(InputParser.Solitary_input_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputParser#new_scanner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_scanner(InputParser.New_scannerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputParser#package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage(InputParser.PackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputParser#radix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadix(InputParser.RadixContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(InputParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(InputParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputParser#special_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_char(InputParser.Special_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(InputParser.NumContext ctx);
}