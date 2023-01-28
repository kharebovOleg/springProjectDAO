package ru.kharebov.spring.dao;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;
import ru.kharebov.spring.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    Faker faker = new Faker();

    {
        people = new ArrayList<>();
//
//        for (int i = 0; i < 25; i++) {
//            people.add(new Person(++PEOPLE_COUNT, faker.name().name()));
//        }


        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Bob"));
        people.add(new Person(++PEOPLE_COUNT, "Mike"));
        people.add(new Person(++PEOPLE_COUNT, "Katy"));

    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
