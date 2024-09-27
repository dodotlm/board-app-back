package com.example.boardappbackend.repository.custom;

import com.example.boardappbackend.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardRepositoryCustom {
    Page<Board> searchAll(String searchCondition, String searchKeyword, Pageable pageable);
}
