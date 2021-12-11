package com.example.myunittesting

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test
import org.mockito.Mockito.*

class MainViewModelTest {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var cuboidModel: CuboidModel

    private val dummyLength = 12.0
    private val dummyWidth = 7.0
    private val dummyHeight = 6.0

    private val dummyVolume = 504.0
    private val dummyCircumference = 100.0
    private val dummySurfaceArea = 396.0

    @Before
    fun before(){
        cuboidModel = mock(CuboidModel::class.java)
        mainViewModel = MainViewModel(cuboidModel)
    }

    @Test
    fun testVolume(){
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth,dummyLength,dummyHeight)
        val volume = mainViewModel.getVolume()
        assertEquals(dummyVolume, volume, 0.0001)
    }

    @Test
    fun testCircumference(){
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight)
        val keliling = mainViewModel.getCircumference()
        assertEquals(dummyCircumference, keliling, 0.0001)
    }

    @Test
    fun testSurfaceArea(){
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight)
        val luas = mainViewModel.getSurfaceArea()
        assertEquals(dummySurfaceArea, luas, 0.0001)
    }

    // Test dengan Mock
    @Test
    fun testMockVolume(){
        `when`(mainViewModel.getVolume()).thenReturn(dummyVolume)
        val volume = mainViewModel.getVolume()
        verify(cuboidModel).getVoulume()
        assertEquals(dummyVolume, volume, 0.0001)
    }

    @Test
    fun testMockCircumference(){
        `when`(mainViewModel.getCircumference()).thenReturn(dummyCircumference)
        val keliling = mainViewModel.getCircumference()
        verify(cuboidModel).getCircumference()
        assertEquals(dummyCircumference, keliling, 0.0001)
    }

    @Test
    fun testMockSurfaceArea(){
        `when`(mainViewModel.getSurfaceArea()).thenReturn(dummySurfaceArea)
        val luas = mainViewModel.getSurfaceArea()
        verify(cuboidModel).getSurfaceArea()
        assertEquals(dummySurfaceArea, luas, 0.0001)
    }

    @Test
    fun getCircumference() {
    }

    @Test
    fun getSurfaceArea() {
    }

    @Test
    fun getVolume() {
    }

    @Test
    fun save() {
    }

}