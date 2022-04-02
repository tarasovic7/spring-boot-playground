package com.tarasovic.demo.controller;

import com.tarasovic.demo.entities.Application;
import com.tarasovic.demo.entities.Ticket;
import com.tarasovic.demo.exception.ApplicationNotFoundException;
import com.tarasovic.demo.service.ApplicationService;
import com.tarasovic.demo.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/tza")
@AllArgsConstructor
public class TzaRestController {

    private ApplicationService applicationService;
    private TicketService ticketService;

    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets() {
        return new ResponseEntity<>(ticketService.listTickets(), HttpStatus.OK);
    }

    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getAllApplications() {
        return new ResponseEntity<>(applicationService.listApplications(), HttpStatus.OK);
    }

    @GetMapping("/application/{id}")
    public ResponseEntity<Application> getApplication(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<>(applicationService.findApplication(id),
                    HttpStatus.OK);
        } catch (ApplicationNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
        }
    }
}
