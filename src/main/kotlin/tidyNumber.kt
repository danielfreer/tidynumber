import kotlin.text.digitToInt

fun tidyNumber(input: String): Int = input
    .toInt(radix = 10)
    .let { (it downTo 0) }
    .first(::isTidy)

fun isTidy(number: Int): Boolean = number
    .toString(radix = 10)
    .fold(true to 0) { (isTidy, prev), char ->
        val current = char.digitToInt(radix = 10)
        val result = if (isTidy && prev <= current) true else false
        result to current
    }
    .first
