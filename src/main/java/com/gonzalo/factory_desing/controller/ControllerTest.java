package com.gonzalo.factory_desing.controller;

import com.gonzalo.factory_desing.factory.ServiceStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerTest {

    @Autowired
    ServiceStrategy serviceStrategy;


    @GetMapping
    public ResponseEntity getText(){
        return ResponseEntity.ok(serviceStrategy.getText());
    }


}
