class LoginService {
    fun authenticate(userName: String, password: String): Boolean {
        return  ("demo" == userName && "demo" == password)
    }
}
