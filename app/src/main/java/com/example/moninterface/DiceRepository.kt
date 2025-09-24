package com.example.moninterface

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

class DiceRepository {
    fun generate(n: Int): Flow<Int> = flow {
        repeat(n) {
            emit((1..6).random())
            delay(200)
        }
    }
}