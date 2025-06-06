package org.example.echonote.service.Impl;

import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.example.echonote.dto.ArticleDTO;
import org.example.echonote.dto.mapper.ArticleMapper;
import org.example.echonote.model.Article;
import org.example.echonote.model.User;
import org.example.echonote.repository.ArticleRepository;
import org.example.echonote.repository.UserRepository;
import org.example.echonote.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;
    private final UserRepository userRepository;

    @Override
    public ArticleDTO createArticle(ArticleDTO articleDTO) {
        Article article = articleMapper.toEntity(articleDTO);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userRepository.findUserByUsername()
    }


    @Override
    public List<ArticleDTO> getArticles() {
        return articleRepository.findAll()
                .stream()
                .map(articleMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ArticleDTO getArticleById(Long id) {
        Article article = articleRepository.findById(id).orElse(null);
        return articleMapper.toDTO(article);
    }

    @Override
    public ArticleDTO updateArticle(ArticleDTO articleDTO) {
        Article article = articleMapper.toEntity(articleDTO);
        Article saved = articleRepository.save(article);
        return articleMapper.toDTO(saved);
    }

    @Override
    public void deleteArticle(Long id) {

    }
}
