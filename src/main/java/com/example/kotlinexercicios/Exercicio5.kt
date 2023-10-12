package com.example.kotlinexercicios

/**
 * Imagine que você precise criar um app de reprodução de música.
 *
 * Crie uma classe que represente a estrutura de uma música.
 * A classe Song precisa incluir estes elementos de código:
 *
 * Propriedades do título, artista, ano de lançamento e contagem de reprodução.
 * Uma propriedade que indica se a música é famosa. Se o número for menor que 1.000, considere que não gostam muito dela.
 * Um método que mostra uma descrição de música neste formato:
 * "[Título], de [artista], lançado em [ano de lançamento]."
 */

fun main() {
    val amanda = Song("Amanda on the Clouds", "Amanda", 2019, 2600)
    val atiqah = Song("Atiqah Together", "Atiqah", 2007, 886)

    amanda.isFamous()
    atiqah.isFamous()
    amanda.showProfile()
    atiqah.showProfile()
}

class Song(val title: String, val artist: String, val dateReleased: Int, val repCount: Int) {
    fun isFamous() {
        if (repCount >= 1000) println("This person is famous, she has $repCount views.")
        else println("This person is not famous, she has $repCount views.")
    }

    fun showProfile() {
        println("$title, from $artist was released in $dateReleased.")
    }
}