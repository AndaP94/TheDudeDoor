package com.pichlera.theDudeDoor.Services;

import com.pichlera.theDudeDoor.Models.Event;
import com.pichlera.theDudeDoor.Models.Person;

import java.util.Optional;

public interface IEventService {

    public void deleteEvent(Event event);
    public Event saveEvent(Event event);
    public Iterable<Event> findAllEvents();
    public Optional<Event> findEventByPerson(Person person);
}
