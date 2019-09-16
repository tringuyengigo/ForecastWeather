package tringuyn.zombieman.forecastweather.ui.weather.current

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel;
import com.bumptech.glide.load.engine.Resource
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import tringuyn.zombieman.forecastweather.data.network.response.CurrentWeatherResponse
import tringuyn.zombieman.forecastweather.data.network.respository.SourceRespository
import javax.inject.Inject

class CurrentWeatherViewModel  @Inject constructor(private val repository: SourceRespository) : ViewModel() {
    fun getCurrentWeatherExample(cityName: String): Single<CurrentWeatherResponse> {
        return repository.getCurrentWeatherExample(cityName).cache()
    }
}
