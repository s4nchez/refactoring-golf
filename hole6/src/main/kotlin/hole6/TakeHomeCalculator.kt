package hole6

internal class TakeHomeCalculator(private val taxRate: TaxRate) {
    fun netAmount(first: Money, vararg rest: Money): Money {
        val pairs = listOf(*rest)
        var total = first
        for (next in pairs) {
            total = total.plus(next)
        }
        val tax = taxRate.apply(total)
        return total.minus(tax)
    }
}