package pl.sda.twitter.servlets;

import pl.sda.twitter.model.TbUser;
import pl.sda.twitter.services.ArticleService;
import pl.sda.twitter.services.ArticleServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

@WebServlet(name = "AddArticleServlet", urlPatterns = {"/addArticle"})
public class AddArticleServlet extends HttpServlet {
    private ArticleService articleService;

    @Override
    public void init(){
        articleService = new ArticleServiceImpl();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String content = request.getParameter("content");
        HttpSession session = request.getSession();
        TbUser user = (TbUser) session.getAttribute("user");
        articleService.addArticle(user, content);
        response.setCharacterEncoding(UTF_8.name());
        response.sendRedirect("index.jsp");
    }
}
