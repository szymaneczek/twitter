package pl.sda.twitter.model;

import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;

public class ArticleDao {
    public void addNewArticle(TbArticle article) {
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        session.save(article);
        session.getTransaction().commit();
    }
    public List getAllArticles() {
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();
        Query q = session.createQuery("select o from TbArticle o");
        //select * from TB_ARTICLE
        return q.getResultList();
    }
}