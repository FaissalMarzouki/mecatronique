package com.Mecatronique.Faissal.controller;

import com.Mecatronique.Faissal.entity.Event;
import com.Mecatronique.Faissal.entity.Sponsor;
import com.Mecatronique.Faissal.repository.EventRepository;
import com.Mecatronique.Faissal.repository.SponsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/events")
public class EventController {

    private final EventRepository eventRepository;
    private final SponsorRepository sponsorRepository;

    @Autowired
    public EventController(EventRepository eventRepository, SponsorRepository sponsorRepository) {
        this.eventRepository = eventRepository;
        this.sponsorRepository = sponsorRepository;
    }

    // Endpoint to retrieve all events
    @GetMapping("/getAllEvents")
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    // Endpoint to retrieve a specific event by its ID
    @GetMapping("/getEventById/{eventID}")
    public Event getEventById(@PathVariable String eventID) {
        return eventRepository.findById(eventID).orElse(null);
    }

    // Endpoint to create a new event
    @PostMapping("/createEvent")
    public Event createEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    // Endpoint to update an existing event
    @PutMapping("/updateEvent/{eventID}")
    public Event updateEvent(@PathVariable String eventID, @RequestBody Event event) {
        event.setEventID(eventID);
        return eventRepository.save(event);
    }

    // Endpoint to delete an event by its ID
    @DeleteMapping("/deleteEvent/{eventID}")
    public void deleteEvent(@PathVariable String eventID) {
        eventRepository.deleteById(eventID);
    }

    // Endpoint to retrieve all sponsors
    @GetMapping("/sponsors/getAllSponsors")
    public List<Sponsor> getAllSponsors() {
        return sponsorRepository.findAll();
    }

    // Endpoint to retrieve a specific sponsor by its ID
    @GetMapping("/sponsors/getSponsorById/{sponsorId}")
    public Sponsor getSponsorById(@PathVariable String sponsorId) {
        return sponsorRepository.findById(sponsorId).orElse(null);
    }

    // Endpoint to create a new sponsor
    @PostMapping("/sponsors/createSponsor")
    public Sponsor createSponsor(@RequestBody Sponsor sponsor) {
        return sponsorRepository.save(sponsor);
    }

    // Endpoint to update an existing sponsor
    @PutMapping("/sponsors/updateSponsor/{sponsorId}")
    public Sponsor updateSponsor(@PathVariable String sponsorId, @RequestBody Sponsor sponsor) {
        sponsor.setIdSponsor(sponsorId);
        return sponsorRepository.save(sponsor);
    }

    // Endpoint to delete a sponsor by its ID
    @DeleteMapping("/sponsors/deleteSponsor/{sponsorId}")
    public void deleteSponsor(@PathVariable String sponsorId) {
        sponsorRepository.deleteById(sponsorId);
    }
}
