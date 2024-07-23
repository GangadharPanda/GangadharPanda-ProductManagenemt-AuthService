package com.auth.service.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

    //http://localhost:8090/auth
    @GetMapping
    public String auth() { return "Hello to the world of Auth Service"; }
}
