fun main() {
    val input = object {}.javaClass
        .getResourceAsStream("input-data-file.txt")
        ?.bufferedReader()
        ?.readLines()
    requireNotNull(input) { "Couldn't read input file." }
    input
        .drop(1)
        .map(::tidyNumber)
        .forEachIndexed { i, result -> println("Case #${i + 1}: $result") }
}
