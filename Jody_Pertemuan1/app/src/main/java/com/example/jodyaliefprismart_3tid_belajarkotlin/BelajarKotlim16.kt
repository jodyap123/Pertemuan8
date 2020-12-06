package com.example.jodyaliefprismart_3tid_belajarkotlin

import java.lang.ArithmeticException

fun main() {
    println("Coba Exception Handling 1")
    try {
        val testError :Int = 10/0
        println("Contoh Error")
        println(testError)
    } catch (e: ArithmeticException) {
        println("Arithmetic Exception")
    } catch (e: Exception) {
        println(e)
    } finally {
        println(
            "Pada block finally, apapun itu yang tetap terjadi ya tetap di print"
        )
    }
    /*----------------------------------------------------------------------------*/
    println("\nCoba Exception Handing 2")
    contohError()
}

fun contohError() {
    try {
        println("Sebelum Exception")
        throw Exception("Hayoooo masalahnya masuk ke Throw")
        println("Sesudah Exception")
    } catch (e : Exception) {
        println(e)
    } finally {
        println("Masih error, tapi finally tetap muncul ya")
    }
}
