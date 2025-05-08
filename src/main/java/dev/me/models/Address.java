package dev.me.models;

import io.micronaut.jsonschema.JsonSchema;
import io.micronaut.serde.annotation.Serdeable;
import io.micronaut.sourcegen.annotations.Builder;

@JsonSchema
@Serdeable
@Builder
public record Address(
        String name,
        int streetNumber
) {
}
