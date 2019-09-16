package tringuyn.zombieman.forecastweather.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import tringuyn.zombieman.forecastweather.di.WeatherApplication
import tringuyn.zombieman.forecastweather.di.module.AppModule
import tringuyn.zombieman.forecastweather.di.module.FragmentModule
import tringuyn.zombieman.forecastweather.di.module.NetworkModule
import tringuyn.zombieman.forecastweather.di.module.ViewModelModule
import javax.inject.Singleton


@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, FragmentModule::class, NetworkModule::class, ViewModelModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: WeatherApplication)
}