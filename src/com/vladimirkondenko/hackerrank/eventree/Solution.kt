package com.vladimirkondenko.hackerrank.eventree

import java.lang.Math.max
import java.lang.Math.min
import java.util.*

val debug = true

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt() // vertices
    val m = scanner.nextInt() // edges
    val tree = Tree(n, m)
    for (i in 1..m) {
        tree.connect(scanner.nextInt(), scanner.nextInt())
    }
    println(tree.solveEvenTree())
}

class Tree(val V: Int, val E: Int, private var connections: Array<ArrayList<Int>> = Array(V + 1) { ArrayList<Int>() }) {

    fun solveEvenTree(): Int {
        var result = 0
        for (i in V downTo 2) {
            val subtree = this.subtree(i)
            pr("Checking subtree $i: $subtree")
            if (subtree.isEven()) {
                pr("Subtree is even")
                disconnect(i, parent(i))
                result += 1
            }
        }
        return result
    }

    fun subtree(v: Int): Tree {
        val subtree = Tree(V, E)
        val children = children(v)
        for (i in v..V) {
            if (i == v || children.contains(i)) children(i).forEach { child ->
                subtree.connect(i, child)
            }
        }
        return subtree
    }

    fun isEven(): Boolean {
        return connections
                .map { arrayList -> arrayList.size }
                .reduce { s1, s2 -> s1 + s2 }
                .inc() // Counting the parent node
                .isEven()
    }

    fun children(v: Int) = connections[v]

    fun parent(u: Int): Int {
        if (u == 1) return 0;
        for (i in 0..connections.size - 1) {
            if (connections[i].contains(u)) return i
        }
        return 0
    }

    fun root(): Int {
        for (c in connections) {
            if (!c.isEmpty()) return connections.indexOf(c)
        }
        return 1
    }

    fun connect(u: Int, v: Int) {
        connections[min(u, v)].add(max(u, v))
    }

    fun disconnect(u: Int, v: Int) {
        if (u != 0 && v != 0)
        pr("Disconnecting $u and $v")
        connections[min(u, v)].remove(max(u, v))
    }

    override fun toString(): String {
        val sb = StringBuilder()
        for (i in 0..connections.size - 1) {
            sb.appendln().append(i).append(": ").append(connections[i])
        }
        return "Tree: $V vertices, $E connections - $sb"
    }

    fun Int.isEven() = this % 2 == 0

    fun pr(s: String) {
        if (debug) println(s)
    }

}
