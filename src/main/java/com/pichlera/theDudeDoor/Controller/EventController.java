package com.pichlera.theDudeDoor.Controller;

import com.google.gson.Gson;
import com.pichlera.theDudeDoor.Models.Event;
import com.pichlera.theDudeDoor.Services.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class EventController implements IEventController {

    private IEventService iEventService;
    private Gson gson;

    @Autowired
    public EventController(IEventService iEventService, Gson gson) {
        this.iEventService = iEventService;
        this.gson = gson;
    }

    @DeleteMapping("/events/{id}")
    @Override
    public void deleteEventById(@PathVariable Long id) {
        this.iEventService.deleteEventById(id);
    }

    @PostMapping("/events/")
    @Override
    public Event saveEvent(@RequestBody Event event) {
        return this.iEventService.saveEvent(event);
    }

    @GetMapping("/events/{personName}")
    @Override
    public ResponseEntity<Optional<Event>> findEventsByPersonName(String personName) {
        return ResponseEntity.ok(this.iEventService.findEventsByPersonName(personName));
    }

    @GetMapping("/events/")
    @Override
    public ResponseEntity<Iterable<Event>> findAllEvents() {

        Event event = new Event();
        Iterable<Event> events = this.iEventService.findAllEvents();
        return ResponseEntity.ok(events);
    }
}
