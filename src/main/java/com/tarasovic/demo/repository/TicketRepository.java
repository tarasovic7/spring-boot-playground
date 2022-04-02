package com.tarasovic.demo.repository;

import com.tarasovic.demo.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
