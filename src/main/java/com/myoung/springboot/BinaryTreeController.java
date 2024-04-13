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

    @PostMapping("/binary-tree")
    public String createTree(@RequestBody List<Integer> numbers) {
        Node root = binaryTreeService.createTree(numbers);
        return root.toString();
    }

    @DeleteMapping("/binary-tree/{id}")
    public void deleteBinaryTree(@PathVariable long id) {
        binaryTreeService.deleteBinaryTree(id);
    }
}
