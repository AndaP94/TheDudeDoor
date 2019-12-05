package com.pichlera.theDudeDoor.Repositories;

import com.pichlera.theDudeDoor.Models.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<Person, Long> {

    public Person findPersonByName(String name);
    public Person findPersonById(Long personId);
}
