package com.example.minecraft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.minecraft.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board,Integer> {
    
}
