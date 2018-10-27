package com.vladimirkondenko.hackerrank

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

fun File.readInt() = this.readText().toInt()

infix fun <T> T.assertEquals(other: T) = assertEquals(this, other)

infix fun <T> T.assertNotEquals(other: T) = assertNotEquals(this, other)