package com.myoung.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:3000")
public class BinaryTreeController {

    @Autowired
    private BinaryTreeService binaryTreeService;


    @GetMapping("/binary-tree")
    public List<BinaryTree> getBinaryTrees() {
        return binaryTreeService.getBinaryTrees();
    }

//    @PostMapping("/binary-tree")
//    public BinaryTree addBinaryTree(@RequestBody String numbers) {
//        return binaryTreeService.createBinaryTree(numbers);
//    }

    @DeleteMapping("/binary-tree/{id}")
    public void deleteBinaryTree(@PathVariable long id) {
        binaryTreeService.deleteBinaryTree(id);
    }
}
