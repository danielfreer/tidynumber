fun main() {
    val input = object {}.javaClass
        .getResourceAsStream("input-data-file.txt")
        ?.bufferedReader()
        ?.readLines()
    requireNotNull(input) { "Couldn't read input file" }
    require(input.first().toInt() == (input.size - 1)) {
        "Wrong number of test cases: Expected ${input.first()} but was ${input.size - 1}"
    }
    val testCases = input.drop(1)
    testCases.forEach { testCase ->
        require(testCase.all { char -> char in '0'..'9' }) {
            "Invalid test case: Expected $testCase to be all digits [0-9]"
        }
    }
    input
        .drop(1)
        .map(::tidyNumber)
        .also { require(it.all(::isTidy)) { "Failed to find tidy numbers" } }
        .forEachIndexed { i, result -> println("Case #${i + 1}: $result") }
}
