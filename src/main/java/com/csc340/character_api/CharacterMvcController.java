package com.csc340.character_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CharacterMvcController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/all")
    public String getAllCharacters(Model model) {
        model.addAttribute("characterList", characterService.getAllCharacters());
        return "character-list";
    }

    @GetMapping("/view/{id}")
    public String getCharacterById(@PathVariable Long id, Model model) {
        model.addAttribute("character", characterService.getCharacterById(id));
        return "character-details";
    }

    @GetMapping("/create")
    public String showCreateForm() {
        return "character-create";
    }

    @GetMapping("/about")
    public String showAboutPage() {
        return "about";
    }

    @GetMapping("/updateForm/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Character character = characterService.getCharacterById(id);
        model.addAttribute("character", character);
        model.addAttribute("title", "Update Character: " + id);
        return "character-update";
    }

    @PostMapping("/create")
    public String createCharacter(Character character, Model model) {

        if (character.getName() == null || character.getName().isBlank()
                || character.getDescription() == null || character.getDescription().isBlank()
                || character.getUniverse() == null || character.getUniverse().isBlank()
                || character.getPower() == null || character.getPower().isBlank()) {

            model.addAttribute("error", "All fields are required.");
            return "character-create";
        }

        characterService.addCharacter(character);
        return "redirect:/all";
    }

    @PostMapping("/update")
    public String updateCharacter(Character character, Model model) {

        if (character.getName() == null || character.getName().isBlank()
                || character.getDescription() == null || character.getDescription().isBlank()
                || character.getUniverse() == null || character.getUniverse().isBlank()
                || character.getPower() == null || character.getPower().isBlank()) {

            model.addAttribute("error", "All fields are required.");
            model.addAttribute("character", character);
            return "character-update";
        }

        characterService.updateCharacter(character.getCharacterId(), character);
        return "redirect:/view/" + character.getCharacterId();
    }
    
    @GetMapping("/delete/{id}")
    public String deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
        return "redirect:/all";
    }

    @GetMapping("/search")
    public String searchCharacters(@RequestParam String name, Model model) {
        model.addAttribute("characterList", characterService.searchCharactersByName(name));
        return "character-list";
    }

    @GetMapping("/category")
    public String getCharactersByCategory(@RequestParam String category, Model model) {
        model.addAttribute("characterList", characterService.getCharactersByUniverse(category));
        return "character-list";
    }
}