// Generated from Output.g4 by ANTLR 4.13.1
package inputoutputbnf;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OutputParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OutputVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OutputParser#identifier_chars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_chars(OutputParser.Identifier_charsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(OutputParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#floating_point_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_point_literal(OutputParser.Floating_point_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(OutputParser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(OutputParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(OutputParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(OutputParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#string_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_content(OutputParser.String_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(OutputParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(OutputParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#number_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_operator(OutputParser.Number_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#arithmetic_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_operations(OutputParser.Arithmetic_operationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#method_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_statement(OutputParser.Method_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#array_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_index(OutputParser.Array_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(OutputParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#format_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_arguments(OutputParser.Format_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#format_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_string(OutputParser.Format_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#object_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_instance(OutputParser.Object_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OutputParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(OutputParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#output_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_statement(OutputParser.Output_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OutputParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(OutputParser.Print_statementContext ctx);
}