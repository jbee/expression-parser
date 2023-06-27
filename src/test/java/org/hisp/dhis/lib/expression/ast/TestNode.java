package org.hisp.dhis.lib.expression.ast;

import org.hisp.dhis.lib.expression.syntax.Parser;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the general functions provided by the default implementations in the {@link Node} API.
 *
 * @author Jan Bernitt
 */
class TestNode {

    @Test
    void testFind_NoMatch() {
        Node<?> root = parse("1+2*3");
        assertNull(root.find(n -> n.getType() == NodeType.NUMBER && ((Number)n.getValue()).intValue() > 3));
    }

    @Test
    void testFind_Match() {
        Node<?> root = parse("1+2*3");
        Node<?> three = root.find(n -> n.getType() == NodeType.NUMBER && ((Number) n.getValue()).intValue() == 3);
        assertNotNull(three);
        assertEquals("3", three.getRawValue());
    }
    @Test
    void testExists_NoMatch() {
        Node<?> root = parse("1+2*3");
        assertFalse(root.exists(n -> n.getType() == NodeType.NUMBER && ((Number)n.getValue()).intValue() > 3));
    }

    @Test
    void testExists_Match() {
        Node<?> root = parse("1+2*4");
        assertTrue(root.exists(n -> n.getType() == NodeType.NUMBER && ((Number) n.getValue()).intValue() == 2));
    }

    private Node<?> parse(String expression) {
        return Parser.parse(expression, List.of(), false);
    }
}
