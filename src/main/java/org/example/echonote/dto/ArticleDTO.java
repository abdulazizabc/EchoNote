package org.example.echonote.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ArticleDTO {

    private String title;

    private String content;

    private String author;

    private List<String> tags;

    private LocalDateTime updatedAt;

    private Integer likesCount;

    private Integer views;

}
