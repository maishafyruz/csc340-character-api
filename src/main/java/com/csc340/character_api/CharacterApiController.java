package com.csc340.character_api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterApiController {

    private final CharacterService characterService;

    public CharacterApiController(CharacterService characterService) {
        this.characterService = characterService;
    }

    // GET /characters
    @GetMapping
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    // GET /characters/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Character> getCharacterById(@PathVariable Long id) {
        Character character = characterService.getCharacterById(id);
        if (character != null) {
            return ResponseEntity.ok(character);
        }
        return ResponseEntity.notFound().build();
    }

    // POST /characters
    @PostMapping
    public ResponseEntity<Character> addCharacter(@RequestBody Character character) {
        
        if (character.getName() == null || character.getName().isBlank()
                || character.getDescription() == null || character.getDescription().isBlank()) {
            return ResponseEntity.badRequest().build();
        }

        Character created = characterService.addCharacter(character);
        return ResponseEntity.ok(created);
    }

    // PUT /characters/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Character> updateCharacter(@PathVariable Long id,
                                                     @RequestBody Character updatedCharacter) {
        if (updatedCharacter.getName() == null || updatedCharacter.getName().isBlank()
                || updatedCharacter.getDescription() == null || updatedCharacter.getDescription().isBlank()) {
            return ResponseEntity.badRequest().build();
        }

        Character updated = characterService.updateCharacter(id, updatedCharacter);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE /characters/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCharacter(@PathVariable Long id) {
        boolean deleted = characterService.deleteCharacter(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // GET /characters/category/{category}
    @GetMapping("/category/{category}")
    public List<Character> getCharactersByCategory(@PathVariable String category) {
        return characterService.getCharactersByUniverse(category);
    }

    // GET /characters/search?name=substring
    @GetMapping("/search")
    public List<Character> searchCharactersByName(@RequestParam String name) {
        return characterService.searchCharactersByName(name);
    }
}