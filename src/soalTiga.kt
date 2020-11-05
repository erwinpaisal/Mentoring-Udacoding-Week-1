fun main(args: Array<String>) {

    var Tempat = arrayOf("udacoding", "tempat 2", "tempat 3", "tempat 4", "tempat 5")

    for (item in Tempat.indices) {

        if (item%5 == 0)
            println(Tempat[item])

    }
    println("nah ini belajar coding yang keren")
}