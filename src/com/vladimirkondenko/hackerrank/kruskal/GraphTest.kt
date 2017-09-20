package com.vladimirkondenko.hackerrank.kruskal

import com.vladimirkondenko.hackerrank.kruskalmstrsub.Solution
import org.junit.Assert.*
import org.junit.Test

class GraphTest {

    @org.junit.Test
    fun minimumSpanningTree() {
        /*
        4 6
        1 2 5
        1 3 3
        4 1 6
        2 4 7
        3 2 4
        3 4 5
         */
        val graph = Solution.Graph(4, 6)
        graph.addEdge(Solution.Edge(1, 2, 5))
        graph.addEdge(Solution.Edge(1, 3, 3))
        graph.addEdge(Solution.Edge(4, 1, 6))
        graph.addEdge(Solution.Edge(2, 4, 7))
        graph.addEdge(Solution.Edge(3, 2, 4))
        graph.addEdge(Solution.Edge(3, 4, 5))
        assertEquals("Checking $graph", 12, graph.minimumSpanningTree().totalWeight())
    }

    @Test
    fun totalWeight() {
        val graph = Solution.Graph(3, 3)
        graph.addEdge(Solution.Edge(1, 2, 5))
        graph.addEdge(Solution.Edge(1, 3, 3))
        graph.addEdge(Solution.Edge(2, 4, 7))
        assertEquals("Checking $graph", 15, graph.totalWeight())

    }

}