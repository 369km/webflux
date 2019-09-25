package com.foo.webflux.controller;

import com.foo.webflux.pojo.User;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

public class FluxClient {
    public static void main(String[] args) {
        WebClient client = WebClient.create("http://172.16.8.155:8081");
        Flux<User> userFlux = client.get().uri("/user")
                .accept(MediaType.APPLICATION_STREAM_JSON)
                .retrieve()
                .bodyToFlux(User.class);
        userFlux.toStream()
                .forEach(System.out::println);
    }
}
