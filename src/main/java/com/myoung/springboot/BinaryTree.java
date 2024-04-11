package com.myoung.springboot;
import jakarta.persistence.*;

@Entity
public class BinaryTree {
    @Id
    @SequenceGenerator(name = "binaryTree_sequence", sequenceName = "binaryTree_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "binaryTree_sequence")
    private long id;






}