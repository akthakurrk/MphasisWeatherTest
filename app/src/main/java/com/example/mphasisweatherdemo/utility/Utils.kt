package com.example.mphasisweatherdemo.utility

class Utils {
    companion object {


        // Converts to celsius
        fun convertFahrenheitToCelsius(fahrenheit: Float): Float {
            return (fahrenheit - 32) * 5 / 9
        }

        // Converts to fahrenheit
        fun convertCelsiusToFahrenheit(celsius: Float): Float {
            return celsius * 9 / 5 + 32
        }

        // kelvin to celsius
        fun convertKelvinToCelsius(k: Float): Float {
            val celsius  = k - 273.15F
            return Math.round(celsius * 100.0)/100.0 .toFloat()
        }
    }
}