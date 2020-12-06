package com.example.jodyaliefprismart_3tid_belajarkotlin

fun main() {
    namaKu()
    contohReturn(  "Budi",  12)
    println("Ini hasil dari function Jumlah: ${jumlah(  5, 10, 15, 20)}")
}

fun namaKu() {
    println("Shumaya Resty R")
}

fun contohReturn(nama: String, umur: Int) {
    println("Halo, namaku $nama, Umurku $umur tahun")
}

fun jumlah(vararg angka: Int): Int {
    var hasilJumlah = 0
    angka.forEach { nilai -> hasilJumlah += nilai }

    return hasilJumlah
}
