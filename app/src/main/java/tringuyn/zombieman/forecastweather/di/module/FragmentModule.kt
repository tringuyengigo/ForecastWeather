package tringuyn.zombieman.forecastweather.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import tringuyn.zombieman.forecastweather.ui.weather.current.CurrentWeatherFragment
import tringuyn.zombieman.forecastweather.ui.weather.future.detail.FutureDetailWeatherFragment
import tringuyn.zombieman.forecastweather.ui.weather.future.list.FutureListWeatherFragment
import tringuyn.zombieman.forecastweather.ui.weather.settings.SettingsFragment

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contributeCurrentWeatherFragment(): CurrentWeatherFragment

//    @ContributesAndroidInjector
//    internal abstract fun contributeFutureDetailWeatherFragment(): FutureDetailWeatherFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeFutureListWeatherFragment(): FutureListWeatherFragment
//
//    @ContributesAndroidInjector
//    internal abstract fun contributeSettingsFragment(): SettingsFragment
}