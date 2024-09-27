package com.example.boardappbackend.repository;

import com.example.boardappbackend.entity.BoardFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardFileRepository extends JpaRepository<BoardFile, Long> {
}
