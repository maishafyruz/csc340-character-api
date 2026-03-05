package com.csc340.character_api;

import jakarta.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    
    private String universe;
    private String power;

    public Character() {}

    public Character(String name, String description, String universe, String power) {
        this.name = name;
        this.description = description;
        this.universe = universe;
        this.power = power;
    }

    public Long getCharacterId() {
        return characterId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUniverse() {
        return universe;
    }

    public String getPower() {
        return power;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public void setPower(String power) {
        this.power = power;
    }
}