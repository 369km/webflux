package com.foo.webflux.service;

import com.foo.webflux.pojo.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> save(User user);

    Flux<User> findUsers();
}
