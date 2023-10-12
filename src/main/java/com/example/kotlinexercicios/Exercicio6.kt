package com.example.kotlinexercicios

/**
 * Normalmente, em um leilão, o maior lance determina o preço de um item.
 * Nesse leilão especial, se não houver um lance para um item,
 * ele vai ser vendido automaticamente para o sistema de leilão pelo preço mínimo.
 *
 * No código inicial fornecido no snippet abaixo,
 * você tem uma função auctionPrice() que aceita um tipo Bid? anulável como argumento.
 *
 * RESULTADO ESPERADO:
 * Item A is sold at 5000.
 * Item B is sold at 3000.
 */

fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}