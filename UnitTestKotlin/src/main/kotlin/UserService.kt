import java.util.ArrayList

class UserService {
    private val list = ArrayList<User>()

    val users: List<User>
        get() = this.list

    fun createUser(user: User): User {
        list.add(user)
        return user
    }

    fun deleteUser(user: User) {
        list.remove(user)
    }
}
