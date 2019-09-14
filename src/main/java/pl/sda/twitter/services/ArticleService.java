package pl.sda.twitter.services;

import pl.sda.twitter.model.TbUser;

import java.util.List;

public interface ArticleService {
    public void addArticle(TbUser user, String content);

    public List getAllArticles();
}
