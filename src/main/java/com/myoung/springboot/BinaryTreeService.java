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


    public BinaryTree createTree(List<Integer> numbers) {
        BinaryTree root = null;
        System.out.println("input numbers : " + numbers);
        for (Integer number : numbers) {
            root = insert(root, number);
        }
        System.out.println("node: " + nodeToString(root));

        return root;

    }

    public static BinaryTree insert(BinaryTree tree, int data) {
        if (tree == null) {
            return new BinaryTree(data, null, null);
        }
        if (data < tree.getRoot()) {
            tree.setLeft(insert(tree.getLeft(), data));
        } else if (data > tree.getRoot()) {
            tree.setRight(insert(tree.getRight(), data));
        }
        return tree;
    }


    public void deleteBinaryTree(long binaryTree) {
        binaryTreeRepository.deleteById(binaryTree);
    }

    public static String nodeToString(Node node) {
        if (node == null) {
            return "";
        }
        return "root: " + node.data + " " + "left: " + nodeToString(node.left) + " " + "right: " + nodeToString(node.right);
    }

    public static String nodeToString(BinaryTree node) {
        if (node == null) {
            return "";
        }
        return "root: " + node.getRoot() + " " + "left: " + nodeToString(node.getLeft()) + " " + "right: " + nodeToString(node.getRight());
    }

    public void saveBinaryTree(BinaryTree binaryTree) {
        binaryTreeRepository.save(binaryTree);
    }
}
