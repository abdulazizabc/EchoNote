package org.example.echonote.dto.mapper;

import org.example.echonote.dto.ArticleDTO;
import org.example.echonote.model.Article;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {

    public ArticleDTO toDTO(Article article) {
        ArticleDTO dto = new ArticleDTO();

        dto.setTitle(article.getTitle());
        dto.setContent(article.getContent());
        dto.setAuthor(article.getAuthor());
        dto.setTags(article.getTags());
        dto.setCreatedAt(article.getCreatedAt());
        dto.setUpdatedAt(article.getUpdatedAt());
        dto.setViews(article.getViews());
        dto.setLikesCount(article.getLikesCount());

        return dto;
    }

    public Article toArticle(ArticleDTO articleDTO) {
        Article article = new Article();

        article.setTitle(articleDTO.getTitle());
        article.setContent(articleDTO.getContent());
        article.setAuthor(articleDTO.getAuthor());
        article.setTags(articleDTO.getTags());
        article.setCreatedAt(articleDTO.getCreatedAt());
        article.setUpdatedAt(articleDTO.getUpdatedAt());
        article.setViews(articleDTO.getViews());
        article.setLikesCount(articleDTO.getLikesCount());

        return article;
    }

}
