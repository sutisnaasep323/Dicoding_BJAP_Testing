package com.example.myunittesting

class MainViewModel(private var cuboidModel: CuboidModel) {
    fun getCircumference() = cuboidModel.getCircumference()

    fun getSurfaceArea()= cuboidModel.getSurfaceArea()

    fun getVolume() = cuboidModel.getVoulume()

    fun save(w: Double, l: Double, h: Double){
        cuboidModel.save(w, l, h)
    }
}