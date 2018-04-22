package com.coderef.delivery.auth.server.controlller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuthController {

    @RequestMapping("/user")
    public Principal getCurrentLoggedInUser(Principal user) {
        return user;
    }
}
