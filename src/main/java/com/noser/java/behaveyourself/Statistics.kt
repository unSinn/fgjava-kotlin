package com.noser.java.behaveyourself

import java.util.*

internal class Statistics {

    private val analyzers = ArrayList<MilageAnalyzer>()

    fun addAnalyzer(analyzer: MilageAnalyzer) {
        analyzers.add(analyzer)
    }

    fun makeStat(): String {
        var avg = 0
        var numberOfTyres = 0

        for (analyzer in analyzers) {
            val tires = analyzer.car.tires
            avg += analyzer.totalMileageOfAllTires
            numberOfTyres += tires.size
            // Doesn't work because it's immutable:
            // tires.clear()
        }

        avg /= numberOfTyres

        return String.format("The average number of miles per tyre is %d", avg)
    }

}