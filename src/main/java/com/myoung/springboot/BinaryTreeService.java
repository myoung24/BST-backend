package com.myoung.springboot;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BinaryTreeService {
    @Autowired
    private BinaryTreeRepository binaryTreeRepository;

    public List<BinaryTree> getBinaryTrees() {
        return (List<BinaryTree>) binaryTreeRepository.findAll();
    }


    public Node createTree(String numbers){
        Node root = null;
        // Split the string into an array of integers
        String[] numbersArray = numbers.split(" ");
        List<Integer> numbersList = new java.util.ArrayList<>();

        for (String number : numbersArray) {
            numbersList.add(Integer.parseInt(number));
        }
        for (Integer number : numbersList) {
            root = BinarySearchTree.insert(root, number);
        }
        return root;

    }





    public void deleteBinaryTree(long binaryTree) {
        binaryTreeRepository.deleteById(binaryTree);
    }
}
