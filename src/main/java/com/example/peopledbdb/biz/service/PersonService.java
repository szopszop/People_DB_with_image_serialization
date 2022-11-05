package com.example.peopledbdb.biz.service;

import com.example.peopledbdb.biz.model.Person;
import com.example.peopledbdb.data.FileStorageRepository;
import com.example.peopledbdb.data.PersonRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.InputStream;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final FileStorageRepository storageRepository;
    private PersonService personService;

    public PersonService(PersonRepository personRepository, FileStorageRepository storageRepository) {
        this.personRepository = personRepository;
        this.storageRepository = storageRepository;
    }

    @Transactional
    public Person save(Person person, InputStream photoStream) {
        Person savedPerson = personRepository.save(person);
        storageRepository.save(person.getPhotoFilename(), photoStream);
        return savedPerson;
    }

    public Optional<Person> findById(Long aLong) {
        return personRepository.findById(aLong);
    }

    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

    public void deleteAllById(Iterable<? extends Long> longs) {
        personRepository.deleteAllById(longs);
    }
}
