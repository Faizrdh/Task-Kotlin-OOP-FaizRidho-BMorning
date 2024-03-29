package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    val bilGenap = mutableListOf<Int>()

    for (i in 1..100){
        if (i % 2 == 0){

            bilGenap.add(i)
        }
    }
    println(bilGenap)

/*    Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini*/

    val bulan = mapOf(
        "Jan" to "januari",
        "Feb" to "febuari",
        "Mart" to "maret",
        "Apr" to "april",
        "Mei" to "mei",
        "Jun" to "juni",
        "Jul" to "juli",
        "Aug" to "agustus",
        "Sep" to "september",
        "Okb" to "oktober",
        "Nov" to "november",
        "Des" to "desember"
    )

    /* Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
     - Jan -> January
     - Feb -> February
     - Dst...*/
    // Buat di bawah sini

    bulan.forEach { (key, value) ->
        println("- $key -> $value")
    }

    /*Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"*/
    val monthNow = bulan.getValue("Nov")
    val birthMonth = bulan.getValue("Jun")

    println("it's $monthNow now , I was born in $birthMonth")


}