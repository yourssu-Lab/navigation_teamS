package com.sample.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    val receivedNumber: MutableLiveData<Int> = MutableLiveData()
    val numberToGive: MutableLiveData<String> = MutableLiveData("")

    fun onClickNavigateButton() {
        //TODO
    }
}