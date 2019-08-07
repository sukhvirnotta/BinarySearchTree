package com.sparta.sn.controller;

import com.sparta.sn.exception.ChildNotFoundException;
import com.sparta.sn.model.BinarySearchTree;
import com.sparta.sn.model.BinaryTree;
import com.sparta.sn.view.ViewManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Arrays;

public class BinarySearchManager {

    private static final String LOG_PROPERTIES_FILE = "resources/log4j.properties";
    private static Logger log = Logger.getLogger(BinarySearchManager.class.getName());

    public void runBinaryTree() throws ChildNotFoundException {
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
        int[] elements = {16, 7, 3, 12, 67, 34, 9, 32, 45, 3};
        BinaryTree binaryTree = new BinarySearchTree(elements);
        binaryTree.getLeftChild(7);
        binaryTree.getRightChild(7);
        int[] sortedTree = binaryTree.getSortedTreeAsc();
        new ViewManager().displayArray(sortedTree);
    }
}
