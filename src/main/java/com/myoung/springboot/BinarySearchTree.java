package com.myoung.springboot;


import java.util.List;
import com.myoung.springboot.BinaryTreeRepository;
import jakarta.transaction.Transactional;
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

//    public List<Node> insertNumbers(List<Integer> numbers) {
//        Node root = null;
//        List<Node> nodes = new java.util.ArrayList<>();
//        for (Integer number : numbers) {
//            root = insert(root, number);
//            nodes.add(root);
//
//        }
//        return nodes;
//    }



}
