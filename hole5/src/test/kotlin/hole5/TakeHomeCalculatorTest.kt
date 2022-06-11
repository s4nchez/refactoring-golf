package hole5

import org.junit.Assert
import org.junit.Test

class TakeHomeCalculatorTest {
    @Test
    @Throws(Exception::class)
    fun canCalculateTax() {
        val first = TakeHomeCalculator(10).netAmount(
            Money(40, "GBP"),
            Money(50, "GBP"),
            Money(60, "GBP")
        ).amount
        Assert.assertEquals(135, first.toLong())
    }

    @Test(expected = Incalculable::class)
    @Throws(Exception::class)
    fun cannotSumDifferentCurrencies() {
        TakeHomeCalculator(10).netAmount(Money(4, "GBP"), Money(5, "USD"))
    }
}