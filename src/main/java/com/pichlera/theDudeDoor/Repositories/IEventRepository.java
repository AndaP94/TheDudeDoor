package com.pichlera.theDudeDoor.Repositories;

import com.pichlera.theDudeDoor.Models.Event;
import com.pichlera.theDudeDoor.Models.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IEventRepository extends CrudRepository<Event, Long> {

    public Optional<Event> findEventsByPersonName(String personName);
    public Event findEventById(Long eventId);
}
