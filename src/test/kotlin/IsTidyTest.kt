import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue

class IsTidyTest : FunSpec({
    context("tidy numbers") {
        tidyNumbers.forEach { number ->
            test("$number is tidy") {
                withClue("expected $number to be tidy") {
                    isTidy(number)
                        .shouldBeTrue()
                }
            }
        }
    }
    context("untidy numbers") {
        untidyNumbers.forEach { number ->
            test("$number is not tidy") {
                withClue("expected $number to not be tidy") {
                    isTidy(number)
                        .shouldBeFalse()
                }
            }
        }
    }
})

private val tidyNumbers = listOf(
    "0",
    "1",
    "2",
    "3",
    "4",
    "5",
    "7",
    "8",
    "9",
    "123",
    "129",
    "399",
    "555",
    "999",
    "224488",
    "1999999999",
    "8999999999999999999",
)

private val untidyNumbers = listOf(
    "20",
    "132",
    "321",
    "441",
    "496",
    "1000",
    "999990",
    "2147483647",
    "9223372036854775807",
)
