package hole2

internal class TakeHomeCalculator(private val percent: Int) {
    fun netAmount(first: Pair<Int, String>, vararg rest: Pair<Int, String>): Pair<Int, String> {
        val pairs = listOf(*rest)
        var total = first
        for (next in pairs) {
            if (next.second != total.second) {
                throw Incalculable()
            }
        }
        for (next in pairs) {
            total = Pair(total.first + next.first, next.second)
        }
        val amount = total.first * (percent / 100.0)
        val tax = Pair(amount.toInt(), first.second)
        return if (total.second != tax.second) {
            throw Incalculable()
        } else {
            Pair(total.first - tax.first, first.second)
        }
    }

    internal class Pair<A, B>(val first: A, val second: B)
}