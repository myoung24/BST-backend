package com.myoung.springboot;

import org.springframework.beans.factory.annotation.Autowired;

public class BinarySearchTree {

    @Autowired
    private static BinaryTreeRepository binaryTreeRepository;

    static Node createNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }



}
