package com.example.boardappbackend.repository;

import com.example.boardappbackend.entity.Board;
import com.example.boardappbackend.repository.custom.BoardRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardRepositoryCustom {
}
