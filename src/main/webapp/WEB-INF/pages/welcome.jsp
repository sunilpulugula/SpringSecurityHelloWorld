<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>HelloWorld page</title>
</head>
<body>
    Greeting : ${greeting}
    <br/>
    <h3>This is a welcome page!!!</h3>

    <a href="<c:url value="/userpage" />">Login</a>
</body>
</html>