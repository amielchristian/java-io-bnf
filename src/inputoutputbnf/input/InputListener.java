// Generated from Input.g4 by ANTLR 4.13.1
package inputoutputbnf;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InputParser}.
 */
public interface InputListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InputParser#input_statement}.
	 * @param ctx the parse tree
	 */
	void enterInput_statement(InputParser.Input_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#input_statement}.
	 * @param ctx the parse tree
	 */
	void exitInput_statement(InputParser.Input_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputParser#scanner_declaration}.
	 * @param ctx the parse tree
	 */
	void enterScanner_declaration(InputParser.Scanner_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#scanner_declaration}.
	 * @param ctx the parse tree
	 */
	void exitScanner_declaration(InputParser.Scanner_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputParser#input_expression}.
	 * @param ctx the parse tree
	 */
	void enterInput_expression(InputParser.Input_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#input_expression}.
	 * @param ctx the parse tree
	 */
	void exitInput_expression(InputParser.Input_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputParser#solitary_input_expression}.
	 * @param ctx the parse tree
	 */
	void enterSolitary_input_expression(InputParser.Solitary_input_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#solitary_input_expression}.
	 * @param ctx the parse tree
	 */
	void exitSolitary_input_expression(InputParser.Solitary_input_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputParser#new_scanner}.
	 * @param ctx the parse tree
	 */
	void enterNew_scanner(InputParser.New_scannerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#new_scanner}.
	 * @param ctx the parse tree
	 */
	void exitNew_scanner(InputParser.New_scannerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputParser#package}.
	 * @param ctx the parse tree
	 */
	void enterPackage(InputParser.PackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#package}.
	 * @param ctx the parse tree
	 */
	void exitPackage(InputParser.PackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputParser#radix}.
	 * @param ctx the parse tree
	 */
	void enterRadix(InputParser.RadixContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#radix}.
	 * @param ctx the parse tree
	 */
	void exitRadix(InputParser.RadixContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(InputParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(InputParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(InputParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(InputParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputParser#special_char}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_char(InputParser.Special_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#special_char}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_char(InputParser.Special_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(InputParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(InputParser.NumContext ctx);
}