package com.vladimirkondenko.hackerrank

import java.io.File

fun File.readInt() = this.readText().toInt()

infix fun Int.pow(pow: Int) = Math.pow(this.toDouble(), pow.toDouble())