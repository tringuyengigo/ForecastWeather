package tringuyn.zombieman.forecastweather.data.network.response


import com.google.gson.annotations.SerializedName
import tringuyn.zombieman.forecastweather.data.db.Current
import tringuyn.zombieman.forecastweather.data.db.Location
import tringuyn.zombieman.forecastweather.data.db.Request

data class CurrentWeatherResponse(
    @SerializedName("current")
    val current: Current,
    @SerializedName("location")
    val location: Location,
    @SerializedName("request")
    val request: Request
)