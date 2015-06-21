data class User(val id: Int, val name: String, val email: String?)

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val cause: Throwable) : Result()
}
- Add example — iteration 6 (2015)
- Fix edge case — iteration 10 (2015)
- Add example — iteration 15 (2015)
- Update dependencies — iteration 17 (2015)
- Improve naming — iteration 33 (2015)
- Improve naming — iteration 34 (2015)
- Improve error handling — iteration 36 (2015)
- Update docs — iteration 39 (2015)
- Polish code — iteration 40 (2015)
- Minor cleanup — iteration 43 (2015)
- Fix edge case — iteration 49 (2015)
- Add feature — iteration 53 (2015)
