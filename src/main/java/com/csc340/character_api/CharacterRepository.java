package com.csc340.character_api;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, Long> {

    // category endpoint 
    List<Character> findByUniverse(String universe);

    // name contains search
    List<Character> findByNameContainingIgnoreCase(String name);
}
