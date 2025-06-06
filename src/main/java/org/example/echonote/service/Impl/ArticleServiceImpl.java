package org.example.echonote.service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.echonote.dto.ArticleDTO;
import org.example.echonote.dto.mapper.ArticleMapper;
import org.example.echonote.repository.ArticleRepository;
import org.example.echonote.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;

    @Override
    public ArticleDTO createArticle(ArticleDTO articleDTO) {
        return articleRepository.save();
    }

    @Override
    public List<ArticleDTO> getArticles() {
        return List.of();
    }

    @Override
    public ArticleDTO getArticleById(Long id) {
        return null;
    }

    @Override
    public ArticleDTO updateArticle(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public void deleteArticle(Long id) {

    }
}
