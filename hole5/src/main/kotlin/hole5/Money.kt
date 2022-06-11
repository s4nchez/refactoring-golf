package hole5

internal class Money(val amount: Int, val currency: String) {
    fun plus(other: Money) =
        if (other.currency != currency) throw Incalculable()
        else Money(amount + other.amount, other.currency)

    fun minus(other: Money) =
        if (currency != other.currency) throw Incalculable()
        else Money(amount - other.amount, currency)
}