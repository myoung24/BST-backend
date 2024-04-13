package com.myoung.springboot;


import java.util.List;
import com.myoung.springboot.BinaryTreeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

public class BinarySearchTree {

    @Autowired
    private static BinaryTreeRepository binaryTreeRepository;

    private static Node createNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    public List<Node> insertNumbers(List<Integer> numbers) {
        Node root = null;
        List<Node> nodes = new java.util.ArrayList<>();
        for (Integer number : numbers) {
            root = insert(root, number);
            nodes.add(root);

        }

        return nodes;
    }

    public static Node insert(Node node, int data) {
        if (node == null) {
            return createNode(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }

        return node;
    }

    public String inOrder(Node node) {
        if (node == null) {
            return "Node is empty";
        } else {

            if (node.left != null) {
                inOrder(node.left);
            }
            if (node.right != null) {
                inOrder(node.right);
            }
            return String.valueOf(node.data);

        }

    }

}
