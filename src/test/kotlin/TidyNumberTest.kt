import io.kotest.assertions.forEachAsClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue

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
})
