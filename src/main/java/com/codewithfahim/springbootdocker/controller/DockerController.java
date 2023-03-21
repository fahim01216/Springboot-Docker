package com.codewithfahim.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DockerController {

    @GetMapping("/docker")
    public String dockerDemo() {
        return "Dockerizing Spring Boot Application";
    }
}
