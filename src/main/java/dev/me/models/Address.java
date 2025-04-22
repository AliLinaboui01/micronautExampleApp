package dev.me.models;

import io.micronaut.jsonschema.JsonSchema;
import io.micronaut.serde.annotation.Serdeable;

@JsonSchema
@Serdeable
public record Address(
        String name,
        int StreetNumber
) {
}
