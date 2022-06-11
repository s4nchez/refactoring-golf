package hole6

class TaxRate(private val percent: Int){
    internal fun apply(total: Money): Money {
        val amount = total.amount * (percent / 100.0)
        return Money(amount.toInt(), total.currency)
    }
}