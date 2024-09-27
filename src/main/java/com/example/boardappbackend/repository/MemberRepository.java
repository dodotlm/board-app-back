package com.example.boardappbackend.repository;

import com.example.boardappbackend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);

    long countByUsername(String username);

    long countByNickname(java.lang.String nickname);
}
