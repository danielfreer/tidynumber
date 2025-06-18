fun tidyNumber(input: String): String = input
    .toInt(radix = 10)
    .let { (it downTo 0) }
    .first(::isTidy)
    .toString()

fun isTidy(number: Int): Boolean = number
    .toString(radix = 10)
    .fold(true to '0') { (isTidy, prev), current ->
        (isTidy && prev <= current) to current
    }
    .first
