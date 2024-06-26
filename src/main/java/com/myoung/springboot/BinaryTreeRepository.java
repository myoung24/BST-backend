package com.myoung.springboot;

import com.myoung.springboot.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinaryTreeRepository extends JpaRepository<BinaryTree, Long> {
}

