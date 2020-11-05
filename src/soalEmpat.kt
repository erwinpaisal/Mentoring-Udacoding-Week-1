fun main(args: Array<String>){
    var nilai: Int = 90
    var grade: String = ""

    when (nilai) {
        in 60..80 -> grade = "Memuaskan"
        in 80..90 -> grade = "Sangat Memuaskan"
        in 90..100 -> grade = "Terpuji"
        in 1..60 -> grade = "Tidak Lulus"
        else -> grade = "Nilai Tidak Valid"
    }

    println("Anda mendapatkan nilai: $grade")
}