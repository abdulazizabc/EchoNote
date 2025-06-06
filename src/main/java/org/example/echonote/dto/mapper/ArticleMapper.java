package org.example.echonote.dto.mapper;

import org.example.echonote.dto.ArticleDTO;
import org.example.echonote.model.Article;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ArticleMapper {

    @Mapping(target = "author", expression = "java(article.getUser().getUsername())")
    ArticleDTO toDTO(Article article);

    @Mapping(target = "user", ignore = true)
    Article toEntity(ArticleDTO dto);
}



