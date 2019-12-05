package com.pichlera.theDudeDoor.Services;

import com.pichlera.theDudeDoor.Models.Person;

public interface IPersonService {

    public void deletePerson(Person person);
    public Person savePerson(Person person);
    public Iterable<Person> findAllPerson();
}
