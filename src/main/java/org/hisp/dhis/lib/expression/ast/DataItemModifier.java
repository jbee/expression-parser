package org.hisp.dhis.lib.expression.ast;

import org.hisp.dhis.lib.expression.spi.ValueType;

import java.util.List;

/**
 * A.K.A "dot functions"
 *
 * @author Jan Bernitt
 */
@SuppressWarnings("java:S115")
public enum DataItemModifier implements Typed
{
    aggregationType(ValueType.STRING),
    maxDate(ValueType.DATE),
    minDate( ValueType.DATE),
    periodOffset(ValueType.NUMBER),
    stageOffset(ValueType.NUMBER),
    yearToDate(),
    periodAggregation(),
    subExpression();

    private final List<ValueType> parameterTypes;

    DataItemModifier(ValueType... parameterTypes) {
        this.parameterTypes = List.of(parameterTypes);
    }

    @Override
    public ValueType getValueType() {
        return ValueType.SAME;
    }

    public List<ValueType> getParameterTypes() {
        return parameterTypes;
    }
}
