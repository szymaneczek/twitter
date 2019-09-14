package pl.sda.twitter.servlets;

import com.google.gson.Gson;
import org.openqa.selenium.remote.http.HttpRequest;
import pl.sda.twitter.services.ArticleService;
import pl.sda.twitter.services.ArticleServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet(name = "ArticlesServlet", urlPatterns = {"/rest/articles"})
public class ArticlesServlet extends HttpServlet {
    private ArticleService articleService = new ArticleServiceImpl();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        String pathInfo = request.getPathInfo();
        if (pathInfo == null || pathInfo.equals("/")){
            List allArticles = articleService.getAllArticles();
        }
    }

    private void sendAsJson(List models, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        Gson gson = new Gson();
        String s = gson.toJson(models);
        PrintWriter writer = response.getWriter();
        writer.print(s);
        writer.flush();
    }

}
