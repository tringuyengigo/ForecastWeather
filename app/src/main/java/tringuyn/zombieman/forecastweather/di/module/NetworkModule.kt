package tringuyn.zombieman.forecastweather.di.module

import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import tringuyn.zombieman.forecastweather.data.network.Api.ApiService
import tringuyn.zombieman.forecastweather.data.network.NetworkConfig
import javax.inject.Singleton

@Module
class NetworkModule {


    @Singleton
    @Provides
    fun provideApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl(NetworkConfig.WEATHER_API)
            .addConverterFactory(GsonConverterFactory.create(
                GsonBuilder()
                .setLenient()
                .create()))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(
                OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build())
            .build()
            .create(ApiService::class.java)
    }

}