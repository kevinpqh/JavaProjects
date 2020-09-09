import org.junit.Test

import org.junit.Assert.*

class LoginServiceTest {
    @Test
    fun authenticateSuccessTest() {
        val login = LoginService()
        assertTrue("authenticate failed", login.authenticate("demo", "demo"))
    }

    @Test
    fun authenticateFailTest() {
        val login = LoginService()
        assertFalse("authenticate failed", login.authenticate("demo1", "demo"))
    }
}
