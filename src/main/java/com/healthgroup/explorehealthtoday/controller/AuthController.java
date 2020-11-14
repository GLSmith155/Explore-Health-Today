package com.healthgroup.explorehealthtoday.controller;

import com.healthgroup.explorehealthtoday.dto.LoginRequest;
import com.healthgroup.explorehealthtoday.service.AuthService;
import com.healthgroup.explorehealthtoday.dto.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

 //This class is for deciding what data goes from front-end to back-end. DTO - Data Transfer Object

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest){
        authService.signup(registerRequest);
        return new ResponseEntity(HttpStatus.OK);

    }
//An end point for login in my AuthController, which is also the entry point for authentication requests into my application.
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){
        return authService.login(loginRequest);
    }
}
