package com.test.demo.controller;

import com.test.demo.dto.EntryDto;
import com.test.demo.service.StringControllerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("string")
public class StringController {

    public StringControllerServiceImpl controllerService;
    @Autowired
    StringController (StringControllerServiceImpl stringControllerService){
        this.controllerService = stringControllerService;
    }

    @PostMapping
    public ResponseEntity getController (@RequestBody EntryDto entryStr ){
        List <String> entry = entryStr.getValue();
        controllerService.saveString(entryStr);

        return new ResponseEntity<>( HttpStatus.OK);
    }
}
