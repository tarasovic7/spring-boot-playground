package com.tarasovic.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String title;
    String description;

    @ManyToOne
    @JoinColumn(name = "application_id")
    Application application;

    @ManyToOne
    @JoinTable(name ="ticket_release", joinColumns = @JoinColumn(name = "ticket_fk"), inverseJoinColumns = @JoinColumn(name = "release_fk"))
    Release release;

    String status;

}
