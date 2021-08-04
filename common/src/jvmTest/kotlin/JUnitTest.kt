import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class JUnitTest {
    @Test
    fun junitTestContains() {
        assertContains("I love Junit", "love")
    }

    @Test
    fun junitTestNotEquals() {
        assertNotEquals("But Kotest is sweet to", "Kotest is sweet")
    }

    @Test
    fun junitTestEquals() {
        assertEquals("Backend is hard for frontenders", "Backend is hard for frontenders")
    }
}
