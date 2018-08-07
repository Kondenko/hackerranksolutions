package com.vladimirkondenko.hackerrank.arrayleftrotation

import com.vladimirkondenko.hackerrank.Solution
import java.util.*


/**
 * <a href="https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem">https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem</a>
 */
object ArrayLeftRotation : Solution<String>() {

    override fun main(args: Array<String>) {
        print(input(Scanner(System.`in`)))
    }

    override fun input(scanner: Scanner): String {
        val nd = scanner.nextLine().split(" ")
        val n = nd[0].trim().toInt()
        val d = nd[1].trim().toInt()
        val a = scanner.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
        return rotLeft(a, d).joinToString(" ")
    }

    fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
        return (a.slice(d until a.size) + a.slice(0 until d)).toTypedArray()
    }

}