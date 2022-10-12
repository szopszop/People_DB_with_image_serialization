package com.example.peopledbdb.data;

import com.example.peopledbdb.biz.model.Person;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//@Component
public class PersonDataLoader implements ApplicationRunner {

    private PersonRepository personRepository;

    public PersonDataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (personRepository.count() == 0) {
            List<Person> people = List.of(
//                    new Person(null, "Jake", "Hake", LocalDate.of(1950, 1, 11), "szopszop123@gmail.com", new BigDecimal("4848")),
//                    new Person(null, "gdf", "gf", LocalDate.of(1977, 1, 11), "szopszop123@gmail.com", new BigDecimal("400")),
//                    new Person(null, "gfd", "gfdg", LocalDate.of(1970, 9, 11), "szopszop123@gmail.com", new BigDecimal("4645")),
//                    new Person(null, "gfd", "hd", LocalDate.of(1959, 1, 11), "szopszop123@gmail.com", new BigDecimal("644")),
//                    new Person(null, "gfd", "hd", LocalDate.of(1959, 1, 11), "szopszop123@gmail.com", new BigDecimal("644")),
//                    new Person(null, "gfd", "hd", LocalDate.of(1959, 1, 11), "szopszop123@gmail.com", new BigDecimal("644"))
            );
            personRepository.saveAll(people);
        }
    }
}
