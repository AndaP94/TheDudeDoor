package com.pichlera.theDudeDoor.Controller;

import com.pichlera.theDudeDoor.Models.Event;
import com.pichlera.theDudeDoor.Services.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class EventController implements IEventController {

    private IEventService iEventService;

    @Autowired
    public EventController(IEventService iEventService) {
        this.iEventService = iEventService;
    }

    @DeleteMapping("/events/{id}")
    @Override
    public void deleteEventById(@PathVariable Long id) {
        this.iEventService.deleteEventById(id);
    }

    @PostMapping("/events")
    @Override
    public Event saveEvent(@RequestBody Event event) {
        return this.iEventService.saveEvent(event);
    }

    @GetMapping("/events/{personName}")
    @Override
    public ResponseEntity<Optional<Event>> findEventsByPersonName(String personName) {
        return ResponseEntity.ok(this.iEventService.findEventsByPersonName(personName));
    }

    @GetMapping("/events")
    @Override
    public ResponseEntity<Iterable<Event>> findAllEvents() {
        return ResponseEntity.ok(this.iEventService.findAllEvents());
    }
}
