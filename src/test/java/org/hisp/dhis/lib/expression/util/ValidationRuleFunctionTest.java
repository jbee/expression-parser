package org.hisp.dhis.lib.expression.util;

import org.hisp.dhis.lib.expression.Expression;
import org.hisp.dhis.lib.expression.spi.ExpressionData;
import org.hisp.dhis.lib.expression.spi.ID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hisp.dhis.lib.expression.spi.ExpressionData.*;
import static org.hisp.dhis.lib.expression.spi.ID.Type.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for functions that are specific to validation rule {@link org.hisp.dhis.lib.expression.Expression.Mode}.
 */
class ValidationRuleFunctionTest {

    @Test
    void testOrgUnit_ancestor_collectUIDs() {
        Expression expression = expression("orgUnit.ancestor(a1234567890, b1234567890)");
        Set<ID> expected = Set.of(
                new ID(OrganisationUnitUID, "a1234567890"),
                new ID(OrganisationUnitUID, "b1234567890")
                );
        assertEquals(expected, expression.collectUIDs());
        assertEquals(expected, expression.collectUIDsOrgUnitAncestor());
    }

    @Test
    void testOrgUnit_ancestor_evaluate() {
        String expression = "orgUnit.ancestor(a1234567890, b1234567890)";
        assertTrue(evaluate(expression, Map.of(ORG_UNIT_ANCESTOR, List.of("/a1234567890/x1234567890"))));
        assertTrue(evaluate(expression, Map.of(ORG_UNIT_ANCESTOR, List.of("/z1234567890/b1234567890/x1234567890"))));
        assertFalse(evaluate(expression, Map.of(ORG_UNIT_ANCESTOR, List.of("/x1234567890"))));
        assertFalse(evaluate(expression, Map.of(ORG_UNIT_ANCESTOR, List.of("/z1234567890/x1234567890"))));
    }

    @Test
    void testOrgUnit_dataSet_collectUIDs() {
        Expression expression = expression("orgUnit.dataSet(a1234567890, b1234567890)");
        Set<ID> expected = Set.of(
                new ID(DataSetUID, "a1234567890"),
                new ID(DataSetUID, "b1234567890")
        );
        assertEquals(expected, expression.collectUIDs());
        assertEquals(expected, expression.collectUIDsOrgUnitDataSet());
    }

    @Test
    void testOrgUnit_dataSet_evaluate() {
        String expression = "orgUnit.dataSet(a1234567890, b1234567890)";
        assertTrue(evaluate(expression, Map.of(ORG_UNIT_DATASET, List.of("a1234567890"))));
        assertTrue(evaluate(expression, Map.of(ORG_UNIT_DATASET, List.of("a1234567890", "b1234567890", "c1234567890"))));
        assertFalse(evaluate(expression, Map.of(ORG_UNIT_DATASET, List.of("x1234567890"))));
        assertFalse(evaluate(expression, Map.of(ORG_UNIT_DATASET, List.of("z1234567890","x1234567890"))));
    }

    @Test
    void testOrgUnit_group_collectUIDs() {
        Expression expression = expression("orgUnit.group(a1234567890, b1234567890)");
        Set<ID> expected = Set.of(
                new ID(OrganisationUnitGroupUID, "a1234567890"),
                new ID(OrganisationUnitGroupUID, "b1234567890")
        );
        assertEquals(expected, expression.collectUIDs());
        assertEquals(expected, expression.collectUIDsOrgUnitGroup());
    }

    @Test
    void testOrgUnit_group_evaluate() {
        String expression = "orgUnit.group(a1234567890, b1234567890)";
        assertTrue(evaluate(expression, Map.of(ORG_UNIT_GROUP, List.of("a1234567890"))));
        assertTrue(evaluate(expression, Map.of(ORG_UNIT_GROUP, List.of("a1234567890", "b1234567890", "c1234567890"))));
        assertFalse(evaluate(expression, Map.of(ORG_UNIT_GROUP, List.of("x1234567890"))));
        assertFalse(evaluate(expression, Map.of(ORG_UNIT_GROUP, List.of("z1234567890","x1234567890"))));
    }

    @Test
    void testOrgUnit_program_collectUIDs() {
        Expression expression = expression("orgUnit.program(a1234567890, b1234567890)");
        Set<ID> expected = Set.of(
                new ID(ProgramUID, "a1234567890"),
                new ID(ProgramUID, "b1234567890")
        );
        assertEquals(expected, expression.collectUIDs());
        assertEquals(expected, expression.collectUIDsOrgUnitProgram());
    }

    @Test
    void testOrgUnit_program_evaluate() {
        String expression = "orgUnit.program(a1234567890, b1234567890)";
        assertTrue(evaluate(expression, Map.of(ORG_UNIT_PROGRAM, List.of("a1234567890"))));
        assertTrue(evaluate(expression, Map.of(ORG_UNIT_PROGRAM, List.of("a1234567890", "b1234567890", "c1234567890"))));
        assertFalse(evaluate(expression, Map.of(ORG_UNIT_PROGRAM, List.of("x1234567890"))));
        assertFalse(evaluate(expression, Map.of(ORG_UNIT_PROGRAM, List.of("z1234567890","x1234567890"))));
    }

    @Test
    void testOrgUnit_program_displayNames() {
        assertEquals("orgUnit.program(first,second)", expression("orgUnit.program(a1234567890, b1234567890)")
                .describe(Map.of("a1234567890", "first", "b1234567890", "second")));
    }

    private static Expression expression(String expression) {
        return new Expression(expression, Expression.Mode.VALIDATION_RULE_EXPRESSION);
    }

    private boolean evaluate(String expression, Map<String, List<String>> extra ) {
        return (Boolean) expression(expression).evaluate(Assertions::fail,
                ExpressionData.builder().supplementaryValues(extra).build());
    }
}
