package com.noser.java.behaveyourself

class MilageAnalyzer(val car: Car) {

    val totalMileageOfAllTires: Int by lazy {
        car.tires.map(Tire::mileage).sum()
    }


}