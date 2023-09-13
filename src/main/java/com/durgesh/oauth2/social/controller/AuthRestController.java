package com.durgesh.oauth2.social.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthRestController {

    @GetMapping()
    public ResponseEntity<?> auth()
    {




        return ResponseEntity.ok("ok");
    }



}
