package com.codegym.demo.service.imp;

import com.codegym.demo.entity.Person;
import com.codegym.demo.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {
    private static Map<Integer, Person> personMap = new HashMap<>();

    static {
        personMap.put(1, new Person(1, "Thien", "Da Nang"));
        personMap.put(2, new Person(2, "Jhin", "Demacia"));
        personMap.put(3, new Person(3, "Vayne", "Nexus"));
        personMap.put(4, new Person(4, "Ezreal", "Ionia"));
        personMap.put(5, new Person(5, "Lucian", "Rift"));
    }

    @Override
    public List<Person> findAll() {
        return new ArrayList<>(personMap.values());
    }

    @Override
    public void add(Person person) {
        personMap.put(person.getId(), person);
    }
}
