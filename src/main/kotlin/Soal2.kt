fun main() {
    /*
   Nama    : Annur Riyadhus Solikhin
   Kelas   : 1C
    */
    var angka = 2
    var pangkat = 6
    var hasil = 1
    var i = 1

    while(i <= pangkat){
        i++
        hasil*=angka
        if (i>pangkat){
            println("$angka Pangkat $pangkat = $hasil")
        }
    }
}