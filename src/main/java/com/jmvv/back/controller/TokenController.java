package com.jmvv.back.controller;

import javax.security.sasl.AuthenticationException;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jmvv.back.dto.LoginRequest;
import com.jmvv.back.service.TokenService;

import lombok.AllArgsConstructor;
@RestController
@AllArgsConstructor
public class TokenController {
    private final AuthenticationManager aManager;
    private final TokenService tokenService;

    @PostMapping("/token")
    public String token(@RequestBody LoginRequest userLogin) throws AuthenticationException{
        Authentication authentication= aManager.authenticate(
            new UsernamePasswordAuthenticationToken(userLogin.user(), userLogin.pass()));
        return tokenService.getToken(authentication);
    }

}
