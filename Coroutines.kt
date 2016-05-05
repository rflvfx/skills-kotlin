import kotlinx.coroutines.*

fun main() = runBlocking {
    val deferred = async { fetchUser() }
    println(deferred.await())
}
suspend fun fetchUser(): String { delay(100); return "Ana" }
- Add example — iteration 1 (2015)
- Fix lint warnings — iteration 3 (2015)
- Add example — iteration 4 (2015)
- Add tests — iteration 9 (2015)
- Optimize performance — iteration 12 (2015)
- Tweak implementation — iteration 14 (2015)
- Minor cleanup — iteration 19 (2015)
- Add example — iteration 20 (2015)
- Tweak implementation — iteration 24 (2015)
- Improve error handling — iteration 25 (2015)
- Update docs — iteration 30 (2015)
- Fix lint warnings — iteration 32 (2015)
- Polish code — iteration 38 (2015)
- Fix lint warnings — iteration 44 (2015)
- Add tests — iteration 48 (2015)
- Optimize performance — iteration 51 (2015)
- Optimize performance — iteration 52 (2015)
- Add validation — iteration 56 (2015)
- Refactor module — iteration 1 (2016)
- Fix typo — iteration 6 (2016)
- Tweak implementation — iteration 10 (2016)
