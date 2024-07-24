package com.auth.service.Controllers;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class AuthController {

    //http://localhost:8090/auth
    @GetMapping
    public String auth() { return "Hello to the world of Auth Service"; }

    @GetMapping("validate/{token}")
    public boolean isValid(@PathVariable("token") String token) {
        System.out.println("Token: " + token);
        return true;
    }
}
