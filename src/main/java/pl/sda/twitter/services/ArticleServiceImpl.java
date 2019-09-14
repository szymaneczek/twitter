package pl.sda.twitter.services;

import pl.sda.twitter.model.ArticleDao;
import pl.sda.twitter.model.TbArticle;
import pl.sda.twitter.model.TbUser;

import java.util.List;

public class ArticleServiceImpl implements ArticleService {
    private ArticleDao articleDao = new ArticleDao();

    @Override
    public void addArticle(TbUser user, String content) {
        TbArticle tbArticle = new TbArticle();
        tbArticle.setUser(user);
        tbArticle.setContent(content);
        articleDao.addNewArticle(tbArticle);
                
    }

    @Override
    public List getAllArticles() {
        return articleDao.getAllArticles();
    }
}
