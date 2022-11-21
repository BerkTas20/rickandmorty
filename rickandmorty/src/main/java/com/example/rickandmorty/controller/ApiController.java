package com.example.rickandmorty.controller;

import com.example.rickandmorty.entity.Character;
import com.example.rickandmorty.service.ApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private ApiServiceImpl apiService;

    @GetMapping("/")
    public ResponseEntity<Character> getCharacter(){
        Character allCharacters = apiService.getAllCharacters();
        return new ResponseEntity<>(allCharacters, HttpStatus.OK);
    }
}
