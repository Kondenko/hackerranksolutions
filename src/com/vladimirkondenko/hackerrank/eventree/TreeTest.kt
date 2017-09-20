package com.vladimirkondenko.hackerrank.eventree

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class TreeTest {

    lateinit var tree: Tree

    @Before
    fun setUp() {
        /*
        10 9
        2 1
        3 1
        4 3
        5 2
        6 1
        7 2
        8 6
        9 8
        10 8
0: []
1: [2, 3, 6]
2: [5, 7]
3: [4]
4: []
5: []
6: [8]
7: []
8: [9, 10]
9: []
10: []
         */
        tree = Tree(10, 9)
        tree.connect(2, 1)
        tree.connect(3, 1)
        tree.connect(4, 3)
        tree.connect(5, 2)
        tree.connect(6, 1)
        tree.connect(7, 2)
        tree.connect(8, 6)
        tree.connect(9, 8)
        tree.connect(10, 8)
    }

    @Test
    fun shouldBeEven() {
        val subtree = tree.subtree(6)
        assertTrue(subtree.isEven())
    }

    @Test
    fun shouldNotBeEven() {
        val subtree = tree.subtree(2)
        assertFalse(subtree.isEven())
    }

    @Test
    fun shouldReturnParent() {
        assertEquals(0, tree.parent(1))
        assertEquals(1, tree.parent(3))
        assertEquals(8, tree.parent(9))
    }

    @Test
    fun shouldReturnCorrectSubtreeRoot() {
        val subtree = tree.subtree(6)
        assertEquals(1, tree.root())
        assertEquals(6, subtree.root())
    }

    @Test
    fun shouldSolveEvenTree() {
        assertEquals(2, tree.solveEvenTree())
    }

}