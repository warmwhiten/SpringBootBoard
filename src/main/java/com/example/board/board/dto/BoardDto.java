package com.example.board.board.dto;
import lombok.Data;

@Data
public class BoardDto {

    private int boardIdx;
    private String title;
    private String contents;
    private int hitCnt;
    private String creatorId;
    private String createdDatetime;
    private String updateId;
    private String updatedDateTime;
}
