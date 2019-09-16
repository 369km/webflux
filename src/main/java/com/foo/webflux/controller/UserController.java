package com.foo.webflux.controller;

import com.foo.webflux.pojo.User;
import com.foo.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Mono<User> save() {
        return userService.save(new User(1L, "fee"));
    }

    @GetMapping
    public Flux<User> findUsers() {
        return userService.findUsers();
    }
}
