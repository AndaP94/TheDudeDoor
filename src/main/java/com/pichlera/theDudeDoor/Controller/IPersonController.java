package com.pichlera.theDudeDoor.Controller;

import com.pichlera.theDudeDoor.Models.Person;
import org.springframework.http.ResponseEntity;

public interface IPersonController {

    public void deletePersonByName(String personName);
    public Person savePerson(Person person);
    public ResponseEntity<Iterable<Person>> findAllPerson();
    public Person findPersonByName(String name);
}
