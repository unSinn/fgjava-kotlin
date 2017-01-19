package com.noser.java.behaveyourself

data class Tire(var name: String, val model: String, val mileage: Int = 0) {

    fun addMilage(miles: Int): Tire {
        return Tire(name, model, mileage + miles)
    }
}