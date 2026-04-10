<!DOCTYPE html>
<html>
<head>
    <title>Update Character</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>

    <nav>
        <a href="/all">Home</a> |
        <a href="/about">About</a> |
        <a href="/create">Add a Character</a>
    </nav>

    <div class="card">
        <h1>Update Character</h1>

        <#if error??>
            <p style="color:red;">${error}</p>
        </#if>

        <form action="/update" method="post">
            <input type="hidden" name="characterId" value="${character.characterId}">

            <label>Name:</label><br>
            <input type="text" name="name" value="${character.name}"><br><br>

            <label>Description:</label><br>
            <input type="text" name="description" value="${character.description}"><br><br>

            <label>Universe:</label><br>
            <input type="text" name="universe" value="${character.universe}"><br><br>

            <label>Power:</label><br>
            <input type="text" name="power" value="${character.power}"><br><br>

            <button type="submit">Update</button>
        </form>
    </div>

</body>
</html>