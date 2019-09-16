package tringuyn.zombieman.forecastweather.ui.weather.current

import android.annotation.SuppressLint
import android.content.Context
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.AndroidSupportInjection
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

import tringuyn.zombieman.forecastweather.R
import tringuyn.zombieman.forecastweather.di.ViewModelFactory
import javax.inject.Inject

class CurrentWeatherFragment : Fragment() {

    companion object {
        fun newInstance() = CurrentWeatherFragment()
    }

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    lateinit var currentWeatherFragmentViewModel: CurrentWeatherViewModel

    //Test Api
//    private val disposables = CompositeDisposable()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.current_weather_fragment, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: Use the ViewModel
        //Test Api
        useViewModelExample()
//        disposables.add(
//            ApiBuilder.getWebService().getCurrentWeather("Paris", "en")
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({
//                Log.e("TriNguyen", "data weather ${it.current} ")
//            }, {
//                Log.e("TriNguyen", "data weather error ${it.message}")
//            }))

    }


    @SuppressLint("CheckResult")
    private fun useViewModelExample() {
        currentWeatherFragmentViewModel = ViewModelProviders.of(this, viewModelFactory).get(CurrentWeatherViewModel::class.java)
        currentWeatherFragmentViewModel.getCurrentWeatherExample("Ho Chi Minh")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.e("TriNguyen", "useViewModelExample data weather ${it} ")
            }, {
                Log.e("TriNguyen", "useViewModelExample data weather error ${it.message}")
            })

    }

}
