import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TidyNumberTest : FunSpec({
    testCases.forEach { (input, expected) ->
        test("$input last tidy number is $expected") {
            val actual = tidyNumber(input)
            actual shouldBe expected
        }
    }
})

private data class TestCase(val input: String, val expected: String)
private val testCases = listOf(
    TestCase(input = "012", expected = "12"),
    TestCase(input = "110", expected = "99"),
    TestCase(input = "132", expected = "129"),
    TestCase(input = "441", expected = "399"),
    TestCase(input = "1000", expected = "999"),
    TestCase(input = "2147483647", expected = "1999999999"),
    TestCase(input = "1122334455667788998", expected = "1122334455667788899"),
    TestCase(input = "9223372036854775807", expected = "8999999999999999999"),
)
