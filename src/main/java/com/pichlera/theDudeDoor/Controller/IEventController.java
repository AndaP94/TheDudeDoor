package com.pichlera.theDudeDoor.Controller;

import com.pichlera.theDudeDoor.Models.Event;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IEventController {

    public void deleteEventById(Long id);
    public Event saveEvent(Event event);
    public ResponseEntity<Optional<Event>> findEventsByPersonName(String personName);
    public ResponseEntity<Iterable<Event>> findAllEvents();
}
