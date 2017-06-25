package com.tistory.heowc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("{message}")
    public String getMessage(@PathVariable String message) {
        return message;
    }
}
