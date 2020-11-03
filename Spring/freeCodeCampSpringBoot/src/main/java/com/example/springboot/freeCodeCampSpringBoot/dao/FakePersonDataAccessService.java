package com.example.springboot.freeCodeCampSpringBoot.dao;

import com.example.springboot.freeCodeCampSpringBoot.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{

    private static List<Person> DB = new ArrayList<>();

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add((new Person(id,person.getName())));
        return 1;
    }

    @Override
    public Optional<Person> getPersonById(UUID id) {
        return DB.stream().filter(person -> person.getId().equals(id)).findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> personMaybe = getPersonById(id);
        if(personMaybe.isEmpty()){
            return 0;
        }
        else{
            System.out.println(personMaybe);
            System.out.println(personMaybe.get());
            DB.remove(personMaybe.get());
        }
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
         return getPersonById(id)
                 .map(p-> {
                     int indexOfUpdatedElement = DB.indexOf(p);
                     if(indexOfUpdatedElement >=0){
                         DB.set(indexOfUpdatedElement, new Person(id,person.getName()));
                     }
                     return 0;
                 }).orElse(0);
    }
}
