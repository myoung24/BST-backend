package com.myoung.springboot;

import jakarta.persistence.*;

@Entity
@Table(name = "binary_tree")
public class BinaryTree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

    @Column(nullable = false)
     private int root;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "left_child")
    private BinaryTree left;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "right_child")
    private BinaryTree right;

    public BinaryTree() {
    }


    public BinaryTree(int root, BinaryTree leftChild, BinaryTree rightChild) {
        this.root = root;
        this.left = leftChild;
        this.right = rightChild;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }
}