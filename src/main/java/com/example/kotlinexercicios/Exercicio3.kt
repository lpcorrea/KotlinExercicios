package com.example.kotlinexercicios

/**
 * Existem três padrões principais de temperatura usados no mundo: Celsius, Fahrenheit e Kelvin.
 *
 * No código inicial fornecido no snippet abaixo, escreva um programa que converta uma temperatura de um padrão a outro usando estas fórmulas:
 *
 * Celsius para Fahrenheit: °F = 9/5 (°C) + 32
 * Kelvin para Celsius: °C = K - 273,15
 * Fahrenheit para Kelvin: K = 5/9 (°F - 32) + 273,15
 * O método String.format("%.2f", /* measurement */ ) é usado para converter um número em um tipo String com duas casas decimais.
 *
 * Resultado Esperado:
 * 27.0 degrees Celsius is 80.60 degrees Fahrenheit.
 * 350.0 degrees Kelvin is 76.85 degrees Celsius.
 * 10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
 */

fun main() {
    val temperatures = arrayOf(27, 350, 10)
    val temperatureType = arrayOf("celsius", "kelvin", "fahrenheit")

    for (i in temperatures.indices) {
        val initialMeasurement: Double = temperatures[i].toDouble()
        val initialUnit = temperatureType[i]
        var finalUnit = "celcius"

        when (initialUnit) {
            "celsius" -> finalUnit = "fahrenheit"
            "kelvin" -> finalUnit = "celsius"
            "fahrenheit" -> finalUnit = "kelvin"
            else -> println("No temperature type informed.")
        }

        val finalMeasurement: Double = conversionFormula(initialMeasurement, initialUnit)

        printFinalTemperature(initialMeasurement, initialUnit, finalUnit, finalMeasurement)
    }
}

fun conversionFormula(initialMeasurement: Double, initialUnit: String): Double {
    return when (initialUnit) {
        "celsius" -> initialMeasurement * 1.8 + 32
        "kelvin" -> initialMeasurement - 273.15
        "fahrenheit" -> (5/9)*(initialMeasurement - 32) + 273.15
        else -> initialMeasurement
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: Double
) {
    val finalMeasurement =
        String.format("%.2f", conversionFormula(initialMeasurement, initialUnit)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}