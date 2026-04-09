<!DOCTYPE html>
<html>
<head>
    <title>Character List</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>

    <nav>
        <a href="/all">Home</a> |
        <a href="/about">About</a> |
        <a href="/create">Add a Character</a>
    </nav>

    <h1>My Favorite Female Superheroes</h1>

    <div class="search-container">

        <form action="/search" method="get">
            <input type="text" name="name" placeholder="Search by name...">
            <button type="submit">Search</button>
        </form>

        <form action="/category" method="get">
            <input type="text" name="category" placeholder="Filter by universe...">
            <button type="submit">Filter</button>
        </form>

    </div>

    <p><a href="/all" class="btn">Show All Characters</a></p>
    
    <#if characterList?size == 0>
        <p>No characters found.</p>
    </#if>

    <div class="gallery">
        <#list characterList as character>
            <div class="card">
                <img src="/images/${character.name?lower_case?replace(" ", "_")}.jpg" alt="${character.name}">

                <h3>${character.name}</h3>
                <p>${character.description}</p>
                <p><strong>Universe:</strong> ${character.universe}</p>
                <p><strong>Power:</strong> ${character.power}</p>

                <a href="/view/${character.characterId}">View Details</a> |
                <a href="/updateForm/${character.characterId}">Edit</a> |
                <a href="/delete/${character.characterId}">Delete</a>
            </div>
        </#list>
    </div>

</body>
</html>