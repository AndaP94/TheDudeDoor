package com.pichlera.theDudeDoor.Controller;

import com.pichlera.theDudeDoor.Models.Person;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IPersonController {

    public void deletePerson(Person person);
    public Person savePerson(Person person);
    public ResponseEntity<List<Person>> findAllPerson();
    public Person findPersonByName(String name);
}
