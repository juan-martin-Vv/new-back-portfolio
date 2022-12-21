package com.jmvv.back.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmvv.back.config.versionVaribleString;


@RestController
@RequestMapping(versionVaribleString.versionApi+"perfil")
public record perfilController(

) {
    @GetMapping("/")
    public ResponseEntity <?> perfil(){
        return new ResponseEntity<>("hola mundo", HttpStatus.OK);
    }
}
