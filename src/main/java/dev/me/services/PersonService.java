package dev.me.services;

import dev.me.interfaces.PersonInterface;
import dev.me.models.Person;
import dev.me.repositories.PersonRepository;
import jakarta.inject.Singleton;

import java.util.List;


@Singleton
public class PersonService  implements PersonInterface {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }
    @Override
    public Person getPerson(Long id) {
        return personRepository.findById(id).orElse(null);
    }
    @Override
    public List<Person> getAll(){
        return personRepository.findAll();
    }
}
