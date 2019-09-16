package com.foo.webflux.pojo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.io.Serializable;

@Document
public class User implements Serializable {
    private static final long serialVersionUID = -1928606958770613929L;
    @Id
    private Long id;
    @Field("name")
    private String name;

    public User() {
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
