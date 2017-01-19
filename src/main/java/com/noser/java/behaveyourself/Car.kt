package com.noser.java.behaveyourself

data class Car(var name: String, val model: String, val tires: List<Tire>) {
    fun drive(miles: Int): Car {
        val usedTires = tires.map { t -> t.addMilage(miles) }
        return Car(name, model, usedTires)
    }
}