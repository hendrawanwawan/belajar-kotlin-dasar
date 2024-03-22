fun main() {

    //Byte only range 64
    var age: Byte = 20
    var nu: Int = 120

    //value terakhir harus ditambahkan F karna klo tidak akan double
    var sample: Float = 21.3F

    println(age)
    println(nu)
    println(sample)

    var binary: Int = 0b01010101

    println(binary)


    //underscore untuk mengetahui jumlah angka ,mislakan ribuan
    var price: Long = 9_000_000_000L
    println(price)


    //conversion untuk mengubah tipe data yang semula Long diubah ke Int
    var priceInt: Int = price.toInt()
    var doubleBinary: Double = binary.toDouble()
    println(priceInt)
    println(doubleBinary)
}

