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
