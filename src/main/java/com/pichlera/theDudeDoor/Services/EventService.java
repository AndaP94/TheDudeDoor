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
    public void deleteEventById(Long eventId) {
        Event event = this.eventRepository.findEventById(eventId);
        this.eventRepository.delete(event);
    }

    @Override
    public Event saveEvent(Event event) {
        return this.eventRepository.save(event);
    }

    @Override
    public Iterable<Event> findAllEvents() {
        return this.eventRepository.findAll();
    }

    @Override
    public Optional<Event> findEventsByPersonName(String personName) {
        return this.eventRepository.findEventsByPersonName(personName);
    }
}
