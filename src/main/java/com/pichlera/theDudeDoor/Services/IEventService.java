package com.pichlera.theDudeDoor.Services;

import com.pichlera.theDudeDoor.Models.Event;
import com.pichlera.theDudeDoor.Models.Person;

import java.util.Optional;

public interface IEventService {

    public void deleteEventById(Long eventId);
    public Event saveEvent(Event event);
    public Iterable<Event> findAllEvents();
    public Optional<Event> findEventsByPersonName(String personName);
}
