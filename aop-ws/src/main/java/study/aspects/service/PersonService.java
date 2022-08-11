package study.aspects.service;

import study.aspects.domain.Person;

public interface PersonService {
    Person getByName(String name);
}
