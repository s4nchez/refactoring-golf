package hole5

internal class TakeHomeCalculator(private val percent: Int) {
    fun netAmount(first: Money, vararg rest: Money): Money {
        val pairs = listOf(*rest)
        var total = first
        for (next in pairs) {
            total = total.plus(next)
        }
        val amount = total.amount * (percent / 100.0)
        val tax = Money(amount.toInt(), first.currency)
        return total.minus(tax)
    }
}