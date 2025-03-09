package dev.me.interfaces;

import dev.me.models.Person;
import dev.me.repositories.PersonRepository;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public interface PersonInterface {

    Person createPerson(Person person) ;

    Person getPerson(Long id) ;

    List<Person> getAll();
}
