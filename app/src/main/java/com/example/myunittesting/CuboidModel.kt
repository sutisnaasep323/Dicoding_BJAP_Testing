package com.example.myunittesting

class CuboidModel {
    private var width = 0.0
    private var height = 0.0
    private var length = 0.0

    //rumus volume
    fun getVoulume(): Double = width * height * length

    // rumus luas
    fun getSurfaceArea(): Double {
        val wl = width * length
        val wh = width * height
        val lh = length * height
        return 2 * (wl + wh + lh)
    }

    /**
     * Rumus Keliling
     */
    fun getCircumference(): Double = 4 * (width + length + height)

    fun save(width: Double, length: Double, height: Double) {
        this.width = width
        this.length = length
        this.height = height
    }

}