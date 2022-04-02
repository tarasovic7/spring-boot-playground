package com.tarasovic.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Release {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String releaseDate;
    String description;
}
