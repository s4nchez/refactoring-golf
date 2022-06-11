package hole3

internal class TakeHomeCalculator(private val percent: Int) {
    fun netAmount(first: Money, vararg rest: Money): Money {
        val pairs = listOf(*rest)
        var total = first
        for (next in pairs) {
            if (next.currency != total.currency) {
                throw Incalculable()
            }
        }
        for (next in pairs) {
            total = Money(total.amount + next.amount, next.currency)
        }
        val amount = total.amount * (percent / 100.0)
        val tax = Money(amount.toInt(), first.currency)
        return if (total.currency != tax.currency) {
            throw Incalculable()
        } else {
            Money(total.amount - tax.amount, first.currency)
        }
    }

    internal class Money(val amount: Int, val currency: String)
}