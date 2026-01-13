package com.example.spendly

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(ExpenseViewModel::class.java) -> {
                ExpenseViewModel(application) as T
            }
            modelClass.isAssignableFrom((IncreaseExpViewModel::class.java))->{
                IncreaseExpViewModel() as T

            }

            else  ->     throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")

        }
    }
}


