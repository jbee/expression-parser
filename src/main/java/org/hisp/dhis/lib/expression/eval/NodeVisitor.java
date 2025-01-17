package org.hisp.dhis.lib.expression.eval;

import org.hisp.dhis.lib.expression.ast.BinaryOperator;
import org.hisp.dhis.lib.expression.ast.DataItemModifier;
import org.hisp.dhis.lib.expression.ast.NamedFunction;
import org.hisp.dhis.lib.expression.ast.NamedValue;
import org.hisp.dhis.lib.expression.ast.Node;
import org.hisp.dhis.lib.expression.ast.NodeType;
import org.hisp.dhis.lib.expression.ast.UnaryOperator;
import org.hisp.dhis.lib.expression.ast.VariableType;
import org.hisp.dhis.lib.expression.spi.DataItemType;

import java.time.LocalDate;
import java.util.function.Consumer;

/**
 * Extended visitor for {@link Node}s by their {@link NodeType}.
 *
 * @author Jan Bernitt
 */
public interface NodeVisitor extends Consumer<Node<?>>
{
    @Override
    @SuppressWarnings("unchecked")
    default void accept(Node<?> node) {
        switch(node.getType()) {
            // complex nodes
            case UNARY_OPERATOR: visitUnaryOperator((Node<UnaryOperator>) node); break;
            case BINARY_OPERATOR: visitBinaryOperator((Node<BinaryOperator>) node); break;
            case ARGUMENT: visitArgument((Node<Integer>) node); break;
            case PAR: visitParentheses((Node<Void>) node); break;
            case FUNCTION: visitFunction((Node<NamedFunction>) node); break;
            case MODIFIER: visitModifier((Node<DataItemModifier>) node); break;
            case DATA_ITEM: visitDataItem((Node<DataItemType>) node); break;
            case VARIABLE: visitVariable((Node<VariableType>) node); break;

            // simple nodes
            case BOOLEAN: visitBoolean((Node<Boolean>) node); break;
            case UID: visitUid((Node<String>) node); break;
            case DATE: visitDate((Node<LocalDate>) node); break;
            case NULL: visitNull((Node<Void>) node); break;
            case NUMBER: visitNumber((Node<Double>) node); break;
            case STRING: visitString((Node<String>) node); break;
            case INTEGER: visitInteger((Node<Integer>) node); break;
            case IDENTIFIER: visitIdentifier(node); break;
            case NAMED_VALUE: visitNamedValue((Node<NamedValue>) node); break;

            default: throw new UnsupportedOperationException("Not type not supported yet: "+node.getType());
        }
    }

    default void visitParentheses(Node<Void> group) {
    }

    default void visitArgument(Node<Integer> argument) {

    }

    default void visitBinaryOperator(Node<BinaryOperator> operator) {

    }

    default void visitUnaryOperator(Node<UnaryOperator> operator) {

    }

    default void visitFunction(Node<NamedFunction> function) {

    }

    default void visitModifier(Node<DataItemModifier> modifier) {

    }

    default void visitDataItem(Node<DataItemType> data) {

    }

    default void visitVariable(Node<VariableType> variable) {

    }

    /*
    Simple nodes:
     */

    default void visitNamedValue(Node<NamedValue> value)
    {

    }

    default void visitNumber(Node<Double> value) {

    }

    default void visitInteger(Node<Integer> value) {

    }

    default void visitBoolean(Node<Boolean> value)
    {

    }

    default void visitNull(Node<Void> value)
    {

    }

    default void visitString(Node<String> value)
    {

    }

    default void visitIdentifier(Node<?> value)
    {
        // identifier nodes use both enums or String values so at this point we can't say what value we got
    }

    default void visitUid(Node<String> value) {

    }

    default void visitDate(Node<LocalDate> value)
    {

    }
}
