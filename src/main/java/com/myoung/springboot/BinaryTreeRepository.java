package com.myoung.springboot;

import com.myoung.springboot.BinaryTree;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinaryTreeRepository extends CrudRepository<BinaryTree, Long> {
}
