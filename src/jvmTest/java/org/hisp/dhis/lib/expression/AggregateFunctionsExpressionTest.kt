package org.hisp.dhis.lib.expression

import org.hisp.dhis.lib.expression.spi.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * @author Jan Bernitt
 */
internal class AggregateFunctionsExpressionTest {
    @Test
    fun testAvg() {
        val dataValues = mapOf<DataItem, Any>(
            Pair(newDeDataItem("u1234567890"), doubleArrayOf(0.0, 10.0, 5.0, 3.0, 7.0)))
        assertEquals(5.0, evaluate("avg(#{u1234567890})", dataValues))
    }

    @Test
    fun testAvg2() {
        val dataValues = java.util.Map.of<DataItem, Any>(
            newDeDataItem("u1234567890"), doubleArrayOf(0.0, 10.0, 5.0, 3.0, 7.0),
            newDeDataItem("v1234567890"), doubleArrayOf(0.0, 10.0, 5.0, 3.0, 7.0))
        assertEquals(10.0, evaluate("avg(#{u1234567890} + #{v1234567890})", dataValues))
    }

    @Test
    fun testSum() {
        val dataValues = java.util.Map.of<DataItem, Any>(
            newDeDataItem("u1234567890"), doubleArrayOf(0.0, 10.0, 5.0, 3.0, 7.0))
        assertEquals(25.0, evaluate("sum(#{u1234567890})", dataValues))
    }

    @Test
    fun testMin() {
        val dataValues = java.util.Map.of<DataItem, Any>(
            newDeDataItem("u1234567890"), doubleArrayOf(0.0, 10.0, 5.0, 3.0, 7.0))
        assertEquals(0.0, evaluate("min(#{u1234567890})", dataValues))
    }

    @Test
    fun testMax() {
        val dataValues = java.util.Map.of<DataItem, Any>(
            newDeDataItem("u1234567890"), doubleArrayOf(0.0, 10.0, 5.0, 3.0, 7.0))
        assertEquals(10.0, evaluate("max(#{u1234567890})", dataValues))
    }

    companion object {
        private fun evaluate(expression: String, dataValues: Map<DataItem, Any>): Double? {
            return Expression(expression).evaluate(
                { name: String? -> null },
                ExpressionData().copy(dataItemValues = dataValues)) as Double?
        }

        private fun newDeDataItem(u1234567890: String): DataItem {
            return DataItem(
                DataItemType.DATA_ELEMENT, ID(ID.Type.DataElementUID, u1234567890),
                QueryModifiers().copy(periodAggregation = true))
        }
    }
}