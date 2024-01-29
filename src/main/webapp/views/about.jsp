<%@ page import="java.time.LocalDateTime" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    <%@include file="all_js_css.jsp" %>
</head>
<body>

<%@ include file="navbar.jsp"%>
    <h1 class="text-center">This is the About page!!</h1>
    <div class="container">
        <h1>Counter : ${counter}</h1>
        <h3>Last Request Time: </h3>
        <h3>Date : ${date}</h3>
        <h3>Time : ${time}</h3>
<%--        <h1>Counter : ${dateTime}</h1>--%>
<%--        <h1>Counter : <%=LocalDateTime.now()%></h1>--%>

    </div>

</body>
</html>