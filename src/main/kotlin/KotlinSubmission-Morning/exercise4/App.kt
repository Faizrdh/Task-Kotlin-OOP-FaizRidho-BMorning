package id.infinitelearning.KotlinSubmission.exercise4

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini
fun main() {
    val numbers = listOf(3, 1, 4, 1, 5, 9, 11, 12)

    try {
        for (i in 0..10) {
            println(numbers[i])
        }
    } catch (e: IndexOutOfBoundsException) {
        println("Index out of bounds exception caught.")
    } finally {
        println("End of loop.")
    }
}
