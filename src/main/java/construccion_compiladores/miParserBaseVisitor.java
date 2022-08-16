// Generated from e:\Documentos\Universidad\Ingeniería electrónica - computación\Tercer Año\Practica y Construccion de Compiladores\construccion_compiladores\src\main\java\construccion_compiladores\miParser.g4 by ANTLR 4.9.2

package construccion_compiladores;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link miParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class miParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements miParserVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitS(miParserParser.SContext ctx) { return visitChildren(ctx); }
}