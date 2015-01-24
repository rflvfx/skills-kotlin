data class User(val id: Int, val name: String, val email: String?)

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val cause: Throwable) : Result()
}
- Add example — iteration 6 (2015)
- Fix edge case — iteration 10 (2015)
- Add example — iteration 15 (2015)
- Update dependencies — iteration 17 (2015)
