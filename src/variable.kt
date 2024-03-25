    /*
    - variable Constant
    constant adalah immutable data, data yang bisa diakses untuk keperluan global
    */

const val todo = "Sedang belajar "
const val doing = "variabel"

fun main() {
    /*
    this program we learn variable
    kotlin mirip c# java
    in kotlin ada dua jenis variabel
    - mutabel bisa diubah = var
    - immutable tidak bisa diubah = val
    */
    //jika kita menggunaka val akan eror karna tidak bisa diubah lagi
    var firstName: String = "wanwan"
    firstName = "wan"
    val age = 30

    println(firstName)
    println(age)

    /*
    - nullable
    if we create variable, tidak diberi nilai, maka akan eror
    kotlin support variable that can be null
    ini dikarenakan kotlin bisa mengakses java, dan kebanyakan di java, semua variabel bisa null
    untuk dikotlin anda bisa menggunakan ?(tanda tanya) setelah tipe datanya
    penggunaaan fitur ini tidak direkomendasikan untuk dikotlin , hany digunakan jika ingin mengakses kode java
    */
    /*var food: String? = "Bakso"
    food = null*/
    var food: String? = null
    food = "Bakso"
    // eror karena food bisa null
    //println(food)

    // cara mengakses yang benar
    println(food)
    println(food?.length)
    println("$todo : $doing")

}