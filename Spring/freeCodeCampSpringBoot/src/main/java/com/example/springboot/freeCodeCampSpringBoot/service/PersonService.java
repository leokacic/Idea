package com.example.springboot.freeCodeCampSpringBoot.service;

import com.example.springboot.freeCodeCampSpringBoot.dao.PersonDao;
import com.example.springboot.freeCodeCampSpringBoot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.addPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }

    public int deletePersonById(UUID id){
        return personDao.deletePersonById(id);
    }

    public int updatePersonById(UUID id, Person person){
        return personDao.updatePersonById(id,person);
    }
    public Optional<Person> getPersonById(UUID id){
        return personDao.getPersonById(id);
    }
}
