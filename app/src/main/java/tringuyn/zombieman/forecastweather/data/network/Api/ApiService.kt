package tringuyn.zombieman.forecastweather.data.network.Api

import io.reactivex.Single
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query
import tringuyn.zombieman.forecastweather.data.network.response.CurrentWeatherResponse

const val API_KEY = "8c6e5b1cc92648064427729c45a37f5d"
//http://api.apixu.com/v1/current.json?key=89e8bd89085b41b7a4b142029180210&q=London&lang=en
//http://api.weatherstack.com/current?access_key=8c6e5b1cc92648064427729c45a37f5d&query=New%20York&lang=en

interface ApiService {
    @GET("current?access_key=8c6e5b1cc92648064427729c45a37f5d")
    fun getCurrentWeather(
        @Query("query") location: String = "Tokyo",
        @Query("lang") languageCode: String = "en"
    ) : Single<CurrentWeatherResponse>
}