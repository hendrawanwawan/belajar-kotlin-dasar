fun main() {
    /*
    -> range
    cara membuat range misal 1 sampai 100 itu menggunakan tanda .. (titik dua kali)
    range umumny digunakan dibagian perulangan(loop)
    */
    //val range = 1..100
    //untuk menggunakan range terbalik
        //val range = 100 downTo 1
    val range = 100 downTo 1 step 2
    println(range)
    //mendapatkan total dari range
    println(range.count())
    //mengecek apakah ada value tersebut
    println(range.contains(50))
    println(range.contains(200))
    //mendapatkan nilai pertama
    println(range.first)
    //mendapatkan nilai terakhir
    println(range.last)
    //mendapatka nilai tiap kenaikan
    println(range.step)

    //range dapat digunakan untuk mengecek kenaikan angka demi angka
}