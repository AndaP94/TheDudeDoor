package com.pichlera.theDudeDoor.Services;

import com.pichlera.theDudeDoor.Models.Person;
import com.pichlera.theDudeDoor.Repositories.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService {

    private IPersonRepository personRepository;

    @Autowired
    public PersonService(IPersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public void deletePersonById(Long personId) {
        Person person = personRepository.findPersonById(personId);
        this.personRepository.delete(person);
    }

    @Override
    public Person savePerson(Person person) {
        return this.personRepository.save(person);
    }

    @Override
    public Iterable<Person> findAllPerson() {
        return this.personRepository.findAll();
    }


}
