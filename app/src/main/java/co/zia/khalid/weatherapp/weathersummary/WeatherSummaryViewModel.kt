package co.zia.khalid.weatherapp.weathersummary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeatherSummaryViewModel : ViewModel() {

    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean> = _dataLoading

    private val _noDataLabel = MutableLiveData<Int>()
    val noDataLabel: LiveData<Int> = _noDataLabel

    fun refresh(){

    }

}