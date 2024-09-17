<!DOCTYPE html>
<html>
<head>
    <title>Информация о сотрудниках</title>
</head>
<body>
<h1>Список сотрудников</h1>
<ul>
    <#list employees as employee>
        <li>
            ФИО: ${employee.fullName}
            Стаж работы: ${employee.experience} years
            Дата рождения: ${employee.dateOfBirth}
            Специализация: ${employee.specialization}
        </li>
    </#list>
</ul>
</body>
</html>