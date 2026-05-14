package com.workspace.fuseintelligence.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuseintelligenceController {

    @GetMapping("/ping")
    public String ping() {
        return "Hello, Connection to Fuse Intelligence was successful !";
    }

}
