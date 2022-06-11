package hole1

import org.junit.Assert
import org.junit.Test

class TakeHomeCalculatorTest {
    @Test
    @Throws(Exception::class)
    fun canCalculateTax() {
        val first = TakeHomeCalculator(10).netAmount(
            TakeHomeCalculator.Pair(40, "GBP"),
            TakeHomeCalculator.Pair(50, "GBP"),
            TakeHomeCalculator.Pair(60, "GBP")
        ).first
        Assert.assertEquals(135, first.toLong())
    }

    @Test(expected = Incalculable::class)
    @Throws(Exception::class)
    fun cannotSumDifferentCurrencies() {
        TakeHomeCalculator(10).netAmount(TakeHomeCalculator.Pair(4, "GBP"), TakeHomeCalculator.Pair(5, "USD"))
    }
}