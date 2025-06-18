fun tidyNumber(input: String): String = buildString(capacity = input.length) {
    var isTidy = true
    val start = input.indexOfFirst { it != '0' }
    for (i in start until input.length) {
        val char = input[i]
        val next = input.getOrNull(i + 1)
        val remaining = { input.drop(i) }
        when {
            !isTidy -> '9'
            next == null -> char
            char < next -> char
            char == next && remaining().all { it >= char } -> char
            else -> {
                isTidy = false
                if (char > '1') char - 1 else null
            }
        }?.also(::append)
    }
}
