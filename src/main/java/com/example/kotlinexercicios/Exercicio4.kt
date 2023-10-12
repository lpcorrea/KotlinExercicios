package com.example.kotlinexercicios

/**
 * Muitas vezes, é necessário preencher perfis para sites on-line que contêm campos obrigatórios e não obrigatórios.
 * Por exemplo, você pode adicionar suas informações pessoais e enviar um link para as pessoas que indicaram que você criasse o perfil.
 *
 * No código inicial fornecido no snippet abaixo, escreva um programa que mostre os detalhes do perfil de uma pessoa.
 *
 * RESULTADO ESPERADO:
 * Name: Amanda
 * Age: 33
 * Likes to play tennis. Doesn't have a referrer.
 *
 * Name: Atiqah
 * Age: 28
 * Likes to climb. Has a referrer named Amanda, who likes to play tennis.
 */

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        print("Likes to $hobby. ")

        if (referrer != null) {
            val referrerName = referrer.name
            val referrerHobby = referrer.hobby
            println("Has a referrer named $referrerName, who likes to $referrerHobby.")
        }else println("Doesn't have a referrer.")
    }
}