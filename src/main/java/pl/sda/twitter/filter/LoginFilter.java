package pl.sda.twitter.filter;

import pl.sda.twitter.model.TbUser;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebFilter("/add-article.jsp")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpSession session = request.getSession();
        TbUser currentUser = (TbUser) session.getAttribute("user");
        if (currentUser == null) {
            String contextPath = request.getServletPath().replace("/", "");
            session.setAttribute("currentPage", contextPath);
            RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("sign-in.jsp");
            requestDispatcher.forward(servletRequest, servletResponse);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}