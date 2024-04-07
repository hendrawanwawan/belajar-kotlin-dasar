fun main() {
    val nilai = 90;

    if(nilai > 95) {            // jika kondisi dalam boleean true
                                //ketika false maka tidak akan menampilkan apapun
                                // maka isi blok akan dieksekusi
        println("lulus bjir")
    }else if (nilai > 75 ){
        println("good game") // jika kondisi ini tidak terpenuhi maka akan kekondisi dibawahnya
    }else if (nilai > 60 ) {
        println("not bad")
    }else {
        println("don't give up")
    }
}
