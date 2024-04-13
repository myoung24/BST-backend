package com.myoung.springboot;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import static com.myoung.springboot.BinarySearchTree.createNode;

@Service
public class BinaryTreeService {

    @Autowired
    private BinaryTreeRepository binaryTreeRepository;

    public List<BinaryTree> getBinaryTrees() {
        return (List<BinaryTree>) binaryTreeRepository.findAll();
    }


    public Node createTree(List<Integer> numbers) {
        Node root = null;
        System.out.println(numbers);
        for (Integer number : numbers) {
            root = insert(root, number);
        }
        System.out.println(root);
        return root;

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


    public void deleteBinaryTree(long binaryTree) {
        binaryTreeRepository.deleteById(binaryTree);
    }

}
