package com.sample.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val receivedNumber: MutableLiveData<Int> = MutableLiveData()
    val numberToGive: MutableLiveData<String> = MutableLiveData("")

    fun onClickNavigateButton() {
        //TODO
    }
}