package com.vladimirkondenko.hackerrank.kruskalmstrsub

import java.util.*
import kotlin.collections.ArrayList
import kotlin.coroutines.experimental.EmptyCoroutineContext.plus
import kotlin.text.StringBuilder

object Solution {

    val debug = false

    fun pr(s: String) {
        if (debug) println(s)
    }

    class UnionFind(var count: Int) {

        val id = IntArray(count)

        init {
            pr("Creating UnionFind with $count elements")
            for (i in 0..count - 1) id[i] = i
        }

        fun connected(p: Int, q: Int): Boolean {
            val equal = find(p) == find(q)
            pr("Checking if $p and $q are " + if (equal) "equal" else "NOT equal")
            return equal
        }

        fun find(p: Int) = id[p - 1]

        fun union(p: Int, q: Int) {
            pr("UnionFind: Uniting $p and $q")
            val pId = find(p)
            val qId = find(q)
            if (pId == qId) return
            for (i in 0..id.size - 1) if (id[i] == pId) id[i] = qId
            count--
        }

    }

    data class Edge(val src: Int = 0, val dest: Int = 0, val weight: Int = 0) : Comparable<Edge> {
        override fun compareTo(other: Edge) = this.weight - other.weight
    }

    class Graph(private var V: Int, private var E: Int, private val edges: ArrayList<Edge> = ArrayList<Edge>()) {

        fun minimumSpanningTree(): Graph {
            pr("Finding MST in $this")
            val mst = Graph(V, 0)
            val unionFind = UnionFind(V)
            val sortedEdges = edges.sortImmutable()
            sortedEdges.forEach { edge ->
                pr("Checking $edge")
                if (!unionFind.connected(edge.src, edge.dest)) {
                    unionFind.union(edge.src, edge.dest)
                    mst.addEdge(edge)
                    pr("Adding $edge")
                    if (mst.E >= V - 1) return mst
                }
            }
            return mst;
        }

        fun addEdge(edge: Edge) {
            edges.add(edge)
            E += 1
        }

        fun totalWeight() = edges.map { edge -> edge.weight }.reduce { w1, w2 -> w1 + w2 }

        override fun toString(): String {
            val sb = StringBuilder()
            edges.forEach { sb.append("\n", it) }
            return "Graph: $V vertices, $E connections - $sb"
        }

    }

    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val n = scanner.nextInt() // vertices
        val m = scanner.nextInt() // connections
        val edges = ArrayList<Edge>(m)
        for (i in 0..m - 1) {
            edges.add(Edge(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()))
        }
        val graph = Graph(n, m, edges)
        val msp = graph.minimumSpanningTree()
        println(msp.totalWeight())
    }

    fun <T : Comparable<T>> ArrayList<T>. sortImmutable(): ArrayList<T> {
        val sortedArray = this
        Collections.sort(sortedArray)
        return sortedArray
    }

}
