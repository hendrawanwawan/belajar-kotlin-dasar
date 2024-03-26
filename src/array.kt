fun main() {
    val nama: Array<String> = arrayOf("halima","fatwa","rifki", "lutfia")
    println(nama[0])
    /*
    - tipe data array
    tipe data array adalah kumpulan data yang sama dalam satu tipe data yang sama

     dalam val kita tidak dapat mengubah  file data  melainkan kita dapat mengganti nilai index dalam array
    * */
    // nama.set(3, "latifa") // kita juga bisa menggunakan yg dibawah
    nama[3] = "latifa"
    println(nama[3])

    // kamu juga bisa membuat array dalam bentuk Int
    //kalau kita sudah bikin array ukuranny itu udah fix
    //kita bisa merubah isi data walaupun itu variabelny val

    val nilai: Array<Int> = arrayOf(10,9,8)

    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    //jika ingin membuat array boleh null

    val names : Array<String?> = arrayOfNulls(4)

    names[0] = "asep"
    names[1] = null
    names[2] = "lala"
    names[3] = "dipsi"


    println(names[0])
    println(names[1])
    println(names[2])
    println(names[3])
    println(names.size)
}