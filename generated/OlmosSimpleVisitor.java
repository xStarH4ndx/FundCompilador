// Generated from OlmosSimple.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OlmosSimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OlmosSimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OlmosSimpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OlmosSimpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosSimpleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(OlmosSimpleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosSimpleParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(OlmosSimpleParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosSimpleParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(OlmosSimpleParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosSimpleParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(OlmosSimpleParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosSimpleParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(OlmosSimpleParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosSimpleParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(OlmosSimpleParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosSimpleParser#comparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOp(OlmosSimpleParser.ComparisonOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosSimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(OlmosSimpleParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosSimpleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(OlmosSimpleParser.TermContext ctx);
}