package com.pichlera.theDudeDoor.Controller;

import com.pichlera.theDudeDoor.Models.Event;
import com.pichlera.theDudeDoor.Models.Person;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IEventController {

    public void deleteEvent(Event event);
    public Event saveEvent(Event event);
    public Event findEventByPerson(Person person);
    public ResponseEntity<List<Event>> findAllEvents();
}
