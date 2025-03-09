package dev.me.models;


import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;

import java.util.List;
import java.util.Map;


@MappedEntity
@Serdeable
public record Person (
        @Id
        @GeneratedValue
        Long id,
        String name,
        String password
){}
