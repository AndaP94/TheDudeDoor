package com.pichlera.theDudeDoor.Services;

import com.pichlera.theDudeDoor.Models.Person;

public interface IPersonService {

    public void deletePersonById(Long personId);
    public Person savePerson(Person person);
    public Iterable<Person> findAllPerson();
}
