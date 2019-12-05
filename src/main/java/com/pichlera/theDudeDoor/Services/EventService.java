package com.pichlera.theDudeDoor.Services;

import com.pichlera.theDudeDoor.Models.Event;
import com.pichlera.theDudeDoor.Models.Person;
import com.pichlera.theDudeDoor.Repositories.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventService implements IEventService {

    private IEventRepository eventRepository;

    @Autowired
    public EventService(IEventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    @Override
    public void deleteEvent(Event event) {

    }

    @Override
    public Event saveEvent(Event event) {
        return null;
    }

    @Override
    public Iterable<Event> findAllEvents() {
        return null;
    }

    @Override
    public Optional<Event> findEventByPerson(Person person) {
        return Optional.empty();
    }
}
