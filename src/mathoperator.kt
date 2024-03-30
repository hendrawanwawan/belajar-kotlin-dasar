fun main() {
    //operasi di kotlin mirip java
    //add .0 to indentify if he double
    var result1= 10.0 / 3.0

    var result2= 10 + 10 / 2
    println(result1)
    println(result2)

    //augmented Assignment
    // a = a+10  == a+=10

    var total : Int = 0

    val barang1 = 100
    total = total + barang1
    val barang2 = 200
    total += barang2
    val barang3 = 300
    total = total + barang3

    println(total)

    // unary operator
    // jika kita hanya ingin menambah satu atau kita ingin menambah sesuai keinginan
    total++
    println(total)
    val suhu = -5
    println(suhu)
    val sehat = true
    // ! this operasi hanya untuk operasi boleean
    println(!sehat)
}