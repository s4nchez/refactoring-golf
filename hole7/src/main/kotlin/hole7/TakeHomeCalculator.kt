package hole7

internal class TakeHomeCalculator(private val taxRate: TaxRate) {
    fun netAmount(first: Money, vararg rest: Money): Money {
        val total = listOf(*rest).fold(first, Money::plus)
        val tax = taxRate.apply(total)
        return total.minus(tax)
    }
}