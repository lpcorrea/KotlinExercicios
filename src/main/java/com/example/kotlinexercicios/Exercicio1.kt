package com.example.kotlinexercicios

/**
 * Normalmente, o smartphone oferece um resumo das notificações.
 *
 * No código inicial fornecido no snippet abaixo, escreva um programa que mostra a mensagem de resumo com base no número de notificações recebidas. A mensagem precisa incluir:
 *
 * O número exato de notificações quando menor que 100.
 * 99+ como o número de notificações quando houver 100 ou mais.
 *
 * Resultado Esperado:
 * You have 51 notifications.
 * Your phone is blowing up! You have 99+ notifications.
 */

fun main() {
    val morningNotification = 42
    val eveningNotification = 155

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages notifications.")
    } else if (numberOfMessages >= 100) {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}