package com.example.mvvc

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {

    private val _count = MutableLiveData<Int>()

    val count: LiveData<Int>
        get() = _count //this is getter

    //setter
    // ? = can be null
    fun increment(){
        _count.value = _count.value?.plus(1)
    }

    fun decrement(){
        _count.value = _count.value?.minus(1)
    }
    ///////////

    init{
        //initialize instance of the view model
        _count.value = 0

        Log.d("MVVC", "ViewModel initialized")
    }

    override fun onCleared() {
        Log.d("MVVC", "ViewModel cleared")
        super.onCleared()
    }
}