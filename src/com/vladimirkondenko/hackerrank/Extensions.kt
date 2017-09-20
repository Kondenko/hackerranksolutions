package com.vladimirkondenko.hackerrank

import java.io.File

fun File.readInt() = this.readText().toInt()

fun IntArray.immutableSort(descending: Boolean = false): IntArray {
    val sorted = this
    sorted.apply { if (descending) this.sortDescending() else this.sort() }
    return sorted
}

//fun assertEqualsFileInput(inputFilePath: String, outputFilePath: String, funcToTest: Consumer<Scanner>) {
//    assertEquals(File(outputFilePath).readInt(), funcToTest(Scanner(File(inputFilePath))))
//}