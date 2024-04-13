package com.myoung.springboot;

import jakarta.persistence.*;

@Entity
public class BinaryTree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String numbers;

    public BinaryTree() {
    }

    public BinaryTree(String numbers) {
        this.numbers = numbers;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }
}