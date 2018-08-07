package com.vladimirkondenko.hackerrank

import java.util.*

abstract class Solution<out T> {

    open fun main(args: Array<String>) {
        print(input(Scanner(System.`in`)))
    }

    abstract fun input(scanner: Scanner): T

}