package com.example.moninterface

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val diceState = MutableStateFlow(0)
    val onRoll = MutableStateFlow(false)
    private val diceRepository = DiceRepository()

    fun roll() {
        viewModelScope.launch {
            onRoll.value = true
            diceRepository.generate(10).collect { value ->
                diceState.value = value
            }
            onRoll.value = false
        }
    }
}