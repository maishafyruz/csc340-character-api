package com.csc340.character_api;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    public Character getCharacterById(Long id) {
        return characterRepository.findById(id).orElse(null);
    }

    public Character addCharacter(Character character) {
        return characterRepository.save(character);
    }

    public Character updateCharacter(Long id, Character updatedCharacter) {
        Character existing = getCharacterById(id);
        if (existing == null) return null;

        existing.setName(updatedCharacter.getName());
        existing.setDescription(updatedCharacter.getDescription());
        existing.setUniverse(updatedCharacter.getUniverse());
        existing.setPower(updatedCharacter.getPower());

        return characterRepository.save(existing);
    }

    public boolean deleteCharacter(Long id) {
        Character existing = getCharacterById(id);
        if (existing == null) return false;

        characterRepository.deleteById(id);
        return true;
    }

    public List<Character> getCharactersByUniverse(String universe) {
        return characterRepository.findByUniverse(universe);
    }

    public List<Character> searchCharactersByName(String name) {
        return characterRepository.findByNameContainingIgnoreCase(name);
    }
} 