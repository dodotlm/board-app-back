package com.example.boardappbackend.dto;

import com.example.boardappbackend.entity.Board;
import com.example.boardappbackend.entity.Member;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BoardDto {
    private Long id;
    private String title;
    private String content;
    private Long writer_id;
    private String nickname;
    private LocalDateTime regdate;
    private LocalDateTime moddate;
    private int cnt;
    private String searchKeyword;
    private String searchCondition;
    private List<BoardFileDto> boardFileDtoList;

    public Board toEntity(Member member) {
        return Board.builder()
                .id(this.id)
                .title(this.title)
                .content(this.content)
                .member(member)
                .regdate(this.regdate)
                .moddate(this.moddate)
                .cnt(this.cnt)
                .searchKeyword(this.searchKeyword)
                .searchCondition(this.searchCondition)
                .boardFileList(new ArrayList<>())
                .build();
    }
}
