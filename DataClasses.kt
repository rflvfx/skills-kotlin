data class User(val id: Int, val name: String, val email: String?)

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val cause: Throwable) : Result()
}
