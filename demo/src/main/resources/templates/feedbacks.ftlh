<!DOCTYPE html>
<html>
<head>
    <title>Отзывы</title>
</head>
<body>
    <h2>Список отзывов</h2>
    <ul>
        <#list feedbacks as feedback>
            <li>
                Автор: ${feedback.author} <br>
                Отзыв: ${feedback.content} <br>
                <form action="/feedback/delete/${feedback.id}" method="post">
                    <input type="submit" value="Удалить отзыв">
                </form>
            </li>
        </#list>
    </ul>
    <h2>Добавить новый отзыв</h2>
    <form action="/feedback/create" method="post">
        <label for="author">Автор:</label><br>
        <input type="text" id="author" name="author" required><br>
        <label for="content">Отзыв:</label><br>
        <textarea id="content" name="content" required></textarea><br>
        <input type="submit" value="Добавить">
    </form>
</body>
</html>