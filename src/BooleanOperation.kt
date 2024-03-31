fun main() {
    // operasiBoolean itu meliputi
    // && || !
    val nilaiUjian = 90
    val nilaiAbsen = 85
    val extraNilai = 76

    val lulusUas = nilaiUjian > 75
    val lulusAbsen = nilaiAbsen > 75
    val lulusExtra = extraNilai > 70

    val lulusUjian = lulusUas && lulusAbsen && lulusExtra
    println(lulusUjian)
}