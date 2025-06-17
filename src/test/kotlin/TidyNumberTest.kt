import io.kotest.assertions.forEachAsClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe

class TidyNumberTest : StringSpec({
    "known tidy numbers" {
        listOf(
            7,
            8,
            123,
            129,
            555,
            999,
            224488,
        ).forEachAsClue { number ->
            isTidy(number)
                .shouldBeTrue()
        }
    }
    "known untidy numbers" {
        listOf(
            20,
            132,
            321,
            496,
            1000,
            999990,
        ).forEachAsClue { number ->
            isTidy(number)
                .shouldBeFalse()
        }
    }
    "all single digits are tidy" {
        (0..9).forEachAsClue { number ->
            isTidy(number)
                .shouldBeTrue()
        }
    }
    "132 last tidy number is 129" {
        tidyNumber("132").shouldBe(129)
    }
    "1000 last tidy number is 999" {
        tidyNumber("1000").shouldBe(999)
    }
    "7 last tidy number is 7" {
        tidyNumber("7").shouldBe(7)
    }
    "worst case scenario for signed int" {
        tidyNumber("2147483647")
            .shouldBe(1_999_999_999)
    }
})
