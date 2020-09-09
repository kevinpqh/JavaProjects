import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class UserServiceTest {
    private var user: User = User(0,"");
    private val userService = UserService()

    @Before
    fun setup() {
        user = User(100, "ramesh")
    }

    @Test
    fun userServiceTest() {
        userService.createUser(user)
        var users = userService.users
        assertEquals(1, users.size.toLong())
        userService.deleteUser(user)
        users = userService.users
        assertEquals(0, users.size.toLong())
    }

}
