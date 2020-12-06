package com.example.jodyaliefprismart_3tid_belajarkotlin

fun main() {
    val jumlah :(Int, Int)->Int = { nilai1: Int, nilai2: Int -> nilai1 + nilai2}
    println("Hasil dari 10 + 3 = ${jumlah(10,3)}")

    val nama :(String,String)->Unit =
        { nama: String, tempatlahir: String -> println("Halo, namaku $nama. " + "Aku lahir di $tempatlahir")}

    nama("Budi","Dumai")
}
