package com.pichlera.theDudeDoor.Controller;

import com.google.gson.Gson;
import com.pichlera.theDudeDoor.Models.Person;
import com.pichlera.theDudeDoor.Services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController implements IPersonController {

    private IPersonService personService;


    @Autowired
    public PersonController(IPersonService personService) {
        this.personService = personService;

    }

    @DeleteMapping("/persons/{id}")
    @Override
    public void deletePersonById(@PathVariable Long id) {
        this.personService.deletePersonById(id);
    }

    @PostMapping("/persons")
    @Override
    public Person savePerson(@RequestBody Person person) {
        return this.personService.savePerson(person);
    }

    @GetMapping("/persons")
    @Override
    public ResponseEntity<Iterable<Person>> findAllPerson() {
        return ResponseEntity.ok(this.personService.findAllPerson());
    }

    @GetMapping("/persons/{name}")
    @Override
    public Person findPersonByName(@PathVariable String name) {
        return this.personService.findPersonByName(name);
    }
}
