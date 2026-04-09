<!DOCTYPE html>
<html>
<head>
    <title>Character Details</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>

    <nav>
        <a href="/all">Home</a> |
        <a href="/about">About</a> |
        <a href="/create">Add a Character</a>
    </nav>

    <div class="card">
        <img src="/images/${character.name?lower_case?replace(" ", "_")}.jpg" alt="${character.name}">

        <h1>${character.name}</h1>
        <p><strong>Description:</strong> ${character.description}</p>
        <p><strong>Universe:</strong> ${character.universe}</p>
        <p><strong>Power:</strong> ${character.power}</p>

        <a href="/updateForm/${character.characterId}">Edit</a>
        <a href="/delete/${character.characterId}">Delete</a>
    </div>

</body>
</html>