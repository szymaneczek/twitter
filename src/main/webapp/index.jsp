<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="articleService" scope="request" class="pl.sda.twitter.services.ArticleServiceImpl"/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">

    <title>SDA Twitter</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/jumbotron/">

    <jsp:include page="include/meta.jsp"/>

</head>

<body>

<jsp:include page="include/menu.jsp"/>

<main id="middle" class="container mt-5 pt-5">
    <%
        List allArticles = articleService.getAllArticles();
        pageContext.setAtribute("articles", allArticles);
    %>
    <div class="jumbotron">
        <c:forEach items="${articles}" var="article">
        <div class="container">
            <h1 class="display-3">Witaj na twitterze!</h1>
            <p>${article.getContent()}</p>
            <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more »</a></p>
        </div>
        </c:forEach>
    </div>
</main>

<jsp:include page="include/footer.jsp"/>
</body>
</html>
