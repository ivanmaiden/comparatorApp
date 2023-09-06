package com.exampleivan.comparatorApp.firstApp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.exampleivan.comparatorApp.firstApp.model.MessageLN

class CompViewModel : ViewModel() {
    val messageLN: LiveData<MessageLN> get() = _messageLN
    private val _messageLN = MutableLiveData<MessageLN>(MessageLN("", ""))



 fun hola () {


    val uno = (_messageLN.value?.textOne)
    val dos = (_messageLN.value?.textTwo)




         }
}







