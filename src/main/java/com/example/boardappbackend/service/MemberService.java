package com.example.boardappbackend.service;

import com.example.boardappbackend.dto.MemberDto;

import java.util.Map;

public interface MemberService {
    Map<String, String> usernameCheck(String username);

    Map<String, String> nicknameCheck(String nickname);

    MemberDto join(MemberDto memberDto);

    MemberDto login(MemberDto memberDto);
}
