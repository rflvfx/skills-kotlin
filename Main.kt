fun main() {
    val nums = listOf(1, 2, 3, 4, 5)
    val evens = nums.filter { it % 2 == 0 }
    println(evens)
}
