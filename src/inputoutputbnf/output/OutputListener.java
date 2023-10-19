// Generated from Output.g4 by ANTLR 4.13.1
package inputoutputbnf;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OutputParser}.
 */
public interface OutputListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OutputParser#identifier_chars}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_chars(OutputParser.Identifier_charsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#identifier_chars}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_chars(OutputParser.Identifier_charsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#floating_point_literal}.
	 * @param ctx the parse tree
	 */
	void enterFloating_point_literal(OutputParser.Floating_point_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#floating_point_literal}.
	 * @param ctx the parse tree
	 */
	void exitFloating_point_literal(OutputParser.Floating_point_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(OutputParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(OutputParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(OutputParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(OutputParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(OutputParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(OutputParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#character_literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_literal(OutputParser.Character_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#character_literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_literal(OutputParser.Character_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(OutputParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(OutputParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#string_content}.
	 * @param ctx the parse tree
	 */
	void enterString_content(OutputParser.String_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#string_content}.
	 * @param ctx the parse tree
	 */
	void exitString_content(OutputParser.String_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(OutputParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(OutputParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(OutputParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(OutputParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#number_operator}.
	 * @param ctx the parse tree
	 */
	void enterNumber_operator(OutputParser.Number_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#number_operator}.
	 * @param ctx the parse tree
	 */
	void exitNumber_operator(OutputParser.Number_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#arithmetic_operations}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operations(OutputParser.Arithmetic_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#arithmetic_operations}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operations(OutputParser.Arithmetic_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#method_statement}.
	 * @param ctx the parse tree
	 */
	void enterMethod_statement(OutputParser.Method_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#method_statement}.
	 * @param ctx the parse tree
	 */
	void exitMethod_statement(OutputParser.Method_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#array_index}.
	 * @param ctx the parse tree
	 */
	void enterArray_index(OutputParser.Array_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#array_index}.
	 * @param ctx the parse tree
	 */
	void exitArray_index(OutputParser.Array_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(OutputParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(OutputParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#format_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFormat_arguments(OutputParser.Format_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#format_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFormat_arguments(OutputParser.Format_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#format_string}.
	 * @param ctx the parse tree
	 */
	void enterFormat_string(OutputParser.Format_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#format_string}.
	 * @param ctx the parse tree
	 */
	void exitFormat_string(OutputParser.Format_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#object_instance}.
	 * @param ctx the parse tree
	 */
	void enterObject_instance(OutputParser.Object_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#object_instance}.
	 * @param ctx the parse tree
	 */
	void exitObject_instance(OutputParser.Object_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OutputParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OutputParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(OutputParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(OutputParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#output_statement}.
	 * @param ctx the parse tree
	 */
	void enterOutput_statement(OutputParser.Output_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#output_statement}.
	 * @param ctx the parse tree
	 */
	void exitOutput_statement(OutputParser.Output_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OutputParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(OutputParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OutputParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(OutputParser.Print_statementContext ctx);
}