package com.example.spendly

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class IncreaseExpViewModel: ViewModel() {

    var DialogOpen by mutableStateOf(false)
        private set

    fun onOpen(){
        DialogOpen = true
    }
    fun onClose(){
        DialogOpen = false
    }
}