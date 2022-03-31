
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<c:forEach items="${list}" var="item">
    Ilosc: ${item.quantity} <br>
    Nazwa produktu: ${item.product.name} <br>
    Cena: ${item.product.price} <br>

</c:forEach>


</body>
</html>
