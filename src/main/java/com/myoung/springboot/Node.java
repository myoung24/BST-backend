package com.myoung.springboot;

import jakarta.persistence.*;


public class Node {

    int key;
    Node left;
    Node right;

    public Node(int value) {
        this.key = value;
        right = null;
        left = null;
    }
}