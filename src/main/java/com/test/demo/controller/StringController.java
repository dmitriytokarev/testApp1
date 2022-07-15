package com.test.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("string")
public class StringController {
    @GetMapping
    public ResponseEntity alive (){
        return new ResponseEntity<>( "s",HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity getController (){
        return new ResponseEntity<>( "s",HttpStatus.OK);

    }
}
