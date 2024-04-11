package com.myoung.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BinaryTreeService {
    @Autowired
    private BinaryTreeRepository binaryTreeRepository;

    public List<BinaryTree> getBinaryTrees() {
        return (List<BinaryTree>) binaryTreeRepository.findAll();
    }

//    public BinaryTree createBinaryTree(String numbers) {
//    }

    public void deleteBinaryTree(long binaryTree) {
        binaryTreeRepository.deleteById(binaryTree);
    }
}
