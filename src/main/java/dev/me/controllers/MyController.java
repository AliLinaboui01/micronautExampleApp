package dev.me.controllers;

import dev.me.models.Person;
import dev.me.services.AvroSchemaGenerator;
import dev.me.services.PersonService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("/persons")
public class MyController {

    private final   PersonService       personService;
    private final   AvroSchemaGenerator schemaGenerator;

    public MyController(PersonService personService, AvroSchemaGenerator schemaGenerator) {
        this.personService = personService;
        this.schemaGenerator = schemaGenerator;
    }

    @Post("/add")
    public HttpResponse<Person> createPerson(@Body Person createdPerson) {
        Person person = personService.createPerson(createdPerson);
        if (person != null) {
            return HttpResponse.ok(person);
        }
        return HttpResponse.status(HttpStatus.BAD_REQUEST);
    }
    @Get("/")
    public HttpResponse<List<Person>> getAll()  {
        List<Person> persons = personService.getAll();
        return HttpResponse.ok(persons);
    }

    @Get("/{id}")
    public HttpResponse<Person> getPersonById(@PathVariable Long id) {
        return HttpResponse.ok(personService.getPerson(id));
    }

    // generate a schema by a defined class on avro

    @Get("/person")
    public String getUserSchema() {
        return schemaGenerator.generateSchema(Person.class);
    }


}
