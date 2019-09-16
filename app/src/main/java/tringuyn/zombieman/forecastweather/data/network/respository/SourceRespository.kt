package tringuyn.zombieman.forecastweather.data.network.respository


import io.reactivex.Single
import tringuyn.zombieman.forecastweather.data.network.Api.ApiService
import tringuyn.zombieman.forecastweather.data.network.response.CurrentWeatherResponse
import javax.inject.Inject
import javax.inject.Singleton


/**
 * Created by Frederick on 24/08/2017.
 */
@Singleton
class SourceRespository @Inject constructor( private val service: ApiService) {

     fun getCurrentWeatherExample(cityName: String): Single<CurrentWeatherResponse> {
         return service.getCurrentWeather(cityName, "en")
     }
}