package com.foo.webflux.controller;

import com.foo.webflux.pojo.User;
import com.foo.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Mono<User> save() {
        return userService.save(new User(4L, "fee"));
    }

    @GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<User> findUsers() {
        return userService.findUsers();
    }
}
