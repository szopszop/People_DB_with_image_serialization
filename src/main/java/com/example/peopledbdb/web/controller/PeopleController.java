package com.example.peopledbdb.web.controller;

import com.example.peopledbdb.biz.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @GetMapping
    public String getPeople(Model model) {
        List<Person> people = List.of(
                new Person(1L,"Jake", "Hake", LocalDate.of(1950,1,11), new BigDecimal("4848")),
                new Person(2L,"gdf", "gf", LocalDate.of(1977,1,11), new BigDecimal("400")),
                new Person(3L,"gfd", "gfdg", LocalDate.of(1970,9,11), new BigDecimal("4645")),
                new Person(4L,"gfd", "hd", LocalDate.of(1959,1,11), new BigDecimal("644")),
                new Person(5L,"gfd", "hd", LocalDate.of(1959,1,11), new BigDecimal("644")),
                new Person(6L,"gfd", "hd", LocalDate.of(1959,1,11), new BigDecimal("644"))
                );
        model.addAttribute("people", people);
        return "people";
    }



}
