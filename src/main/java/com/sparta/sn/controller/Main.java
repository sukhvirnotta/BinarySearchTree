package com.sparta.sn.controller;

import com.sparta.sn.exception.ChildNotFoundException;

public class Main {
    public static void main(String[] args) throws ChildNotFoundException {
        new BinarySearchManager().runBinaryTree();
    }
}
