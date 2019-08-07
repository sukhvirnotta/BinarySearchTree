package com.sparta.sn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.sparta.sn.exception.ChildNotFoundException;
import com.sparta.sn.model.BinarySearchTree;
import com.sparta.sn.model.BinaryTree;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class BinaryTreeTest
{
    private static BinaryTree binaryTree;
    private static int rootValue = 7;

    @Before
    public void init() {
        binaryTree = new BinarySearchTree(rootValue);
    }

    @Test
    public void testRootElement() {
        assertEquals(rootValue, binaryTree.getRootElement());
    }

    @Test
    public void testAddElement() {
        binaryTree.addElement(5);
        assertTrue(binaryTree.findElement(5));
    }

    @Test
    public void testDuplicateElement() {
        binaryTree.addElement(7);
        assertEquals(1, binaryTree.getNumberOfElements());
    }

    @Test
    public void testAddElements() {
        int[] elements = {3, 6, 9, 2, 11};
        binaryTree.addElements(elements);
        assertTrue(binaryTree.findElement(9));
    }

    @Test
    public void testFindElement() {
        int[] elements = {4, 9, 8, 3, 2};
        binaryTree.addElements(elements);
        assertTrue(binaryTree.findElement(8));
    }

    @Test
    public void testNumberOfElements() {
        int[] elements = {7, 4, 9, 8, 3, 5};
        BinaryTree tree = new BinarySearchTree(elements);
        assertEquals(elements.length, tree.getNumberOfElements());
    }

    @Test
    public void testLeftChild() throws ChildNotFoundException {
        int[] elements = {6, 4, 8, 3, 5, 7, 9};
        BinaryTree tree = new BinarySearchTree(elements);
        assertEquals(7, tree.getLeftChild(8));
    }

    @Test
    public void testRightChild() throws ChildNotFoundException {
        int[] elements = {6, 4, 8, 3, 5, 7, 9};
        BinaryTree tree = new BinarySearchTree(elements);
        assertEquals(9, tree.getRightChild(8));
    }

    @Test
    public void testSortedTreeAsc() {
        int[] elements = {6, 4, 8, 3, 5, 7, 9};
        BinaryTree tree = new BinarySearchTree(elements);
        int[] sortedAscArray = tree.getSortedTreeAsc();
        for (int i = 0; i < sortedAscArray.length-1; i++) {
            assertTrue(sortedAscArray[i+1] >= sortedAscArray[i]);
        }
    }

    @Test
    public void testSortedTreeAscArrayLength() {
        int[] elements = {6, 4, 8, 3, 5, 7, 9};
        BinaryTree tree = new BinarySearchTree(elements);
        assertEquals(elements.length, tree.getSortedTreeAsc().length);
    }

    @Test
    public void testSortedTreeDesc() {
        int[] elements = {6, 4, 8, 3, 5, 7, 9};
        BinaryTree tree = new BinarySearchTree(elements);
        int[] sortedDescArray = tree.getSortedTreeDesc();
        for (int i = 0; i < sortedDescArray.length-1; i++) {
            assertTrue(sortedDescArray[i+1] <= sortedDescArray[i]);
        }
    }

    @Test
    public void testSortedTreeDescArrayLength() {
        int[] elements = {6, 4, 8, 3, 5, 7, 9};
        BinaryTree tree = new BinarySearchTree(elements);
        assertEquals(elements.length, tree.getSortedTreeDesc().length);
    }

    @Test
    public void testSortedTreeAscContainingNegatives() {
        int[] elements = {-4, 2, -1, 7, 13, 34, -23};
        BinaryTree tree = new BinarySearchTree(elements);
        int[] sortedAscArray = tree.getSortedTreeAsc();
        for (int i = 0; i < sortedAscArray.length-1; i++) {
            assertTrue(sortedAscArray[i+1] >= sortedAscArray[i]);
        }
    }

    @Test
    public void testSortedTreeDescContainingNegatives() {
        int[] elements = {-4, 2, -1, 7, 13, 34, -23};
        BinaryTree tree = new BinarySearchTree(elements);
        int[] sortedDescArray = tree.getSortedTreeDesc();
        for (int i = 0; i < sortedDescArray.length-1; i++) {
            assertTrue(sortedDescArray[i+1] <= sortedDescArray[i]);
        }
    }

    @Test(expected = ChildNotFoundException.class)
    public void testLeftChildNotFoundException() throws ChildNotFoundException {
        int[] elements = {6, 4, 8, 3, 5, 7, 9};
        BinaryTree tree = new BinarySearchTree(elements);
        tree.getLeftChild(3);
    }

    @Test(expected = ChildNotFoundException.class)
    public void testRightChildNotFoundException() throws ChildNotFoundException {
        int[] elements = {6, 4, 8, 3, 5, 7, 9};
        BinaryTree tree = new BinarySearchTree(elements);
        tree.getRightChild(7);
    }
}
