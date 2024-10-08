package com.springsecurity.springsecurity.controllers;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "Hello World" + request.getSession().getId();
    }

    @GetMapping("/csrf-token")
    public CsrfToken getcsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

}
