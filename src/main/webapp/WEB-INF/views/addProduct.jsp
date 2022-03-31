<%--
  Created by IntelliJ IDEA.
  User: emil
  Date: 31.03.2022
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/addtocart">
    Id produktu: <input type="text"  name="id"/> <br />
    Nazwa produktu: <input type="text"  name="name"/> <br />
    Cena: <input name="price" type="text"/>  <br />
    <button type="submit">Wyslij</button>
</form>
<a href="/cart"> Cart Items</a>
</body>
</html>
