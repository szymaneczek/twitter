
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SDA Twitter Dodawanie wpisu</title>
    <jsp:include page="include/meta.jsp"/>
</head>
<body>
<jsp:include page="include/menu.jsp"/>
<div class="container mt-xl-5 pt-5">
    <div class="row text-center">
        <div class="col-md-8 m-auto text-left">
            <h4>Dodaj nowy wpis</h4>
            <form class="needs-validator" novalidate="">
                <div class="mb-3">
                    <input type="text" class="form-control" id="title" placeholder="Tytuł" required="">
                </div>
                <div class="form-group">
                    <div class="form-group"></div>
                    <textarea placeholder="Treść" class="form-control" id="content" rows="3"></textarea>
                </div>
                <hr class="md-4"/>
                <button class="btn btn-primary btn-lg btn-block" type="submit">Wyślij</button>
                </form>
        </div>
    </div>

    <jsp:include page="include/footer.jsp"/>
</div>
</body>
</html>
