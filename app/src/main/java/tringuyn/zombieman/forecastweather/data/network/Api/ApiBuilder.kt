package tringuyn.zombieman.forecastweather.data.network.Api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiBuilder() {
    companion object {
        private val apiInterface: ApiService? = null
        fun getWebService(): ApiService {
            if (apiInterface != null) {
                return apiInterface
            }

            val retrofit = Retrofit.Builder().baseUrl("http://api.weatherstack.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(OkHttpClient.Builder()
                    .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                    .build())
                .build()

            return retrofit.create(ApiService::class.java)
        }
    }
}