package org.hisp.dhis.lib.expression.spi;

import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.Map;

/**
 * The value context used during expression evaluation.
 * <p>
 * These are the values plugged into the expression for data items, variables or the general context.
 */
@Value
@Builder(toBuilder = true)
public class ExpressionData {

    /**
     * Key for {@link #supplementaryValues}, expects values to be a single value of the current context organisation
     * unit path value.
     */
    public static final String ORG_UNIT_ANCESTOR = "orgUnit.ancestor";

    /**
     * Key for {@link #supplementaryValues}, expects value to be a set of the UIDs of all the data sets which occur in
     * an {@code orgUnit.dataSet} function argument (of the current expression) and which do have the current
     * organisation unit as a source.
     */
    public static final String ORG_UNIT_DATASET = "orgUnit.dataSet";

    /**
     * Key for {@link #supplementaryValues}, expects value to be a set of the UIDs of all the organisation unit groups
     * which occur in an {@code orgUnit.group} function argument (of the current expression) and which do have the
     * current organisation unit as a member.
     */
    public static final String ORG_UNIT_GROUP = "orgUnit.group";

    /**
     * Key for {@link #supplementaryValues}, expects value to be a set of the UIDs of all the programs which occur in an
     * {@code orgUnit.program} function argument (of the current expression) and which are connected to the current
     * organisation unit.
     */
    public static final String ORG_UNIT_PROGRAM = "orgUnit.program";

    @Builder.Default
    Map<String, ? extends VariableValue> programRuleVariableValues = Map.of();
    @Builder.Default
    Map<String, Object> programVariableValues = Map.of();
    @Builder.Default
    Map<String, List<String>> supplementaryValues = Map.of();
    @Builder.Default
    Map<DataItem, Object> dataItemValues = Map.of();
    @Builder.Default
    Map<String, Object> namedValues = Map.of();

}
