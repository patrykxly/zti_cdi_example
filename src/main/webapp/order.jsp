<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Złożenie zamówienia</title>
</head>
<body>
<h1>Złóż zamówienie</h1>
<form action="order" method="post">
    E-mail: <input type="email" name="email" required><br>
    Nazwa produktu: <input type="text" name="productName" required><br>
    Ilość: <input type="number" name="quantity" required><br>
    <input type="submit" value="Złóż zamówienie">
</form>
</body>
</html>
