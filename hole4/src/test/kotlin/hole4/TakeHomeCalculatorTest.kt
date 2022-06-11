package hole4

import org.junit.Assert
import org.junit.Test

class TakeHomeCalculatorTest {
    @Test
    @Throws(Exception::class)
    fun canCalculateTax() {
        val first = TakeHomeCalculator(10).netAmount(
            TakeHomeCalculator.Money(40, "GBP"),
            TakeHomeCalculator.Money(50, "GBP"),
            TakeHomeCalculator.Money(60, "GBP")
        ).amount
        Assert.assertEquals(135, first.toLong())
    }

    @Test(expected = Incalculable::class)
    @Throws(Exception::class)
    fun cannotSumDifferentCurrencies() {
        TakeHomeCalculator(10).netAmount(TakeHomeCalculator.Money(4, "GBP"), TakeHomeCalculator.Money(5, "USD"))
    }
}