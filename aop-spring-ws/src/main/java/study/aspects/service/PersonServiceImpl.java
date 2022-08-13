package study.aspects.service;

import org.springframework.stereotype.Service;
import study.aspects.dao.PersonDao;
import study.aspects.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonDao personDao;

    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public Person getByName(String name) {
        return personDao.findByName(name);
    }
}
