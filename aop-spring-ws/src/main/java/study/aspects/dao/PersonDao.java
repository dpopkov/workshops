package study.aspects.dao;

import study.aspects.domain.Person;

public interface PersonDao {

    Person findByName(String name);
}
