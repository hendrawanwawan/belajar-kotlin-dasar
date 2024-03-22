fun main() {
    //string itu tipe data yang berisikan kumpulan karakter atau sederhanya teks
    //string memiliki dua tanda petik berbeda dengan char hanya memiliki satu tanda petikk yeaaay

    var firstName: String = "hendrawan"
    var lastName: String = "Wawan"

    //jika ingin membuat paragraf bisa menggunakan
    //""text"" dan trim untuk memngabungkan paragraf
    var address: String = """
        |saya tingaal di sulsel,
        |kabupaten bone
        |indonesia
    """.trimMargin()

    println(firstName)
    println(lastName)
    println(address)


    // mengabungkan string menggunakan opertaion +
    //    var fullName: String = firstName + " " + lastName

    // string template
    /*
    string template adalah kemampuan string di kotlin yang mendukung ekspresi template
    dengan template kita bisa mengakses secara otomatis data dari luar teks string
    $ adalah tanda untuk template
    $ {isi ekspresi}
    */

    var fullName: String = "$firstName $lastName"
    println(fullName)

    //menggunakan string template jika ingin mengetahui length atau panjang
    //
    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}