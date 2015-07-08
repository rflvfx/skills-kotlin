import kotlinx.coroutines.*

fun main() = runBlocking {
    val deferred = async { fetchUser() }
    println(deferred.await())
}
suspend fun fetchUser(): String { delay(100); return "Ana" }
- Add example — iteration 1 (2015)
