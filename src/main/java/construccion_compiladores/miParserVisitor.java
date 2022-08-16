// Generated from e:\Documentos\Universidad\Ingeniería electrónica - computación\Tercer Año\Practica y Construccion de Compiladores\construccion_compiladores\src\main\java\construccion_compiladores\miParser.g4 by ANTLR 4.9.2

package construccion_compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link miParserParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(miParserParser.SContext ctx);
}