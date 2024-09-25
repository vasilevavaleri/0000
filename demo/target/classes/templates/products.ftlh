<!DOCTYPE html>
<html>
<head>
    <title>grooming</title>
</head>
<body>
<h1>Груминг салон</h1><hr>
<h4>Лучшие услуги в городе</h4>
<form action="/" method="get">
    Поиск по названию услуги: <input type="text" name="title"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Создать новую услугу</h3>
<form action="/product/create" method="post">
    Название услуги: <input type="text" name="title"/><br><br>
    Описание услуги: <input type="text" name="description"/><br><br>
    Цена: <input type="number" name="price"/><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
<form action="/feedbacks" method="get">
    <input type="submit" value="Отзывы">
</form>
</body>
</html>
