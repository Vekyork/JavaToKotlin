package com.android.javatokotlin.repository

import com.android.javatokotlin.data.Weather

class Repository: IRepository {

    private val weathers: List<Weather>

    init {

        val weather = Weather(temperature = 20, town = "City")

        val weather2 = weather.copy()

        val (a, b) = weather2

        weathers = listOf(
                Weather("Москва", 20),
                Weather("Санкт-Петербург", 15),
        )
    }

    override fun getWeathers(): List<Weather> {
        return weathers
    }

    override fun Weather(temperature: Int, town: String): Weather {
        TODO("Not yet implemented")
    }
}

private operator fun Unit.component2() {

}

private operator fun Unit.component1() {

}

interface IRepository{
    fun getWeathers(): List<Weather>
    abstract fun Weather(temperature: Int, town: String): Weather
}

object RepositorySingle : IRepository {

    private val weathers: List<Weather> = listOf(
            Weather("Москва", 20),
            Weather("Санкт-Петербург", 15),
    )

    override fun getWeathers(): List<Weather> {
        return weathers
    }

    override fun Weather(temperature: Int, town: String): Weather {
        TODO("Not yet implemented")
    }
}

fun getRepository(): IRepository{
    return Repository()
}