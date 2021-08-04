import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ExampleTest : StringSpec({
    "String length should return the length of the string" {
        "sammy".length shouldBe 5
        "".length shouldBe 0
    }
})
