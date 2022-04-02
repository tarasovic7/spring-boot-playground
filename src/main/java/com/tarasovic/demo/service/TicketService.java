package com.tarasovic.demo.service;

import com.tarasovic.demo.entities.Ticket;
import com.tarasovic.demo.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.toList;
import static java.util.stream.StreamSupport.stream;

@Service
@AllArgsConstructor
public class TicketService {

    TicketRepository ticketRepository;

    public List<Ticket> listTickets(){
        return stream(ticketRepository.findAll().spliterator(),false).collect(toList());
    }
}
