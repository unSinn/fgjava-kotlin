package com.noser.java.behaveyourself


/**
 * Features of Kotlin
 * - Type Inference
 * - Data Classes
 * - No more Semicolons
 * - Lists are Immutable by default
 * - Named Parameters and Default Values
 * - String Interpolation "blabla $yxx"
 */

object Main {

    @JvmStatic fun main(args: Array<String>) {

        val porsche = Car("Porsche", "911", listOf(Tire("H14", "Bridgestone")))


        val drivenPorsche = porsche.drive(500)

        val analyzer = MilageAnalyzer(porsche)

        println("Total miles of all tyres is ${analyzer.totalMileageOfAllTires}")

        val furtherdrivenPorsche = drivenPorsche.drive(1500)

        println("Total miles of all tyres is " + analyzer.totalMileageOfAllTires)

        val statistics = Statistics()
        statistics.addAnalyzer(analyzer)

        println(statistics.makeStat())
    }

}


