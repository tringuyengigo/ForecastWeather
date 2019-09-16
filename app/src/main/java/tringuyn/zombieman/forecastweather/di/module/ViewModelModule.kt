package tringuyn.zombieman.forecastweather.di.module

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import tringuyn.zombieman.forecastweather.di.ViewModelKey
import tringuyn.zombieman.forecastweather.ui.weather.current.CurrentWeatherViewModel
import tringuyn.zombieman.forecastweather.ui.weather.future.detail.FutureDetailWeatherViewModel
import tringuyn.zombieman.forecastweather.ui.weather.future.list.FutureListWeatherViewModel

@Module
internal abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(CurrentWeatherViewModel::class)
    abstract fun bindCurrentWeatherViewModel(viewModel : CurrentWeatherViewModel) : ViewModel

//    @Binds
//    @IntoMap
//    @ViewModelKey(FutureDetailWeatherViewModel::class)
//    abstract fun bindFutureDetailWeatherViewModel(viewModel : FutureDetailWeatherViewModel) : ViewModel
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(FutureListWeatherViewModel::class)
//    abstract fun bindFutureListWeatherViewModel(viewModel : FutureListWeatherViewModel) : ViewModel


}