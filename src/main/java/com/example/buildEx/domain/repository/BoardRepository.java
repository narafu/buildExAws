package com.example.buildEx.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.buildEx.domain.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}