<!DOCTYPE html>
<html>
<head>
    <title>Create Character</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>

    <nav>
        <a href="/all">Home</a> |
        <a href="/about">About</a> |
        <a href="/create">Add a Character</a>
    </nav>

    <div class="card">
        <h1>Create New Character</h1>

        <#if error??>
            <p style="color:red;">${error}</p>
        </#if>

        <form action="/create" method="post">
            <label>Name:</label><br>
            <input type="text" name="name"><br><br>

            <label>Description:</label><br>
            <input type="text" name="description"><br><br>

            <label>Universe:</label><br>
            <input type="text" name="universe"><br><br>

            <label>Power:</label><br>
            <input type="text" name="power"><br><br>

            <button type="submit">Create</button>
        </form>
    </div>

</body>
</html>