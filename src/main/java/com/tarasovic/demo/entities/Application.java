package com.tarasovic.demo.entities;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="application_id")
    Long id;

    @Column(name = "app_name", nullable = false)
    String name;

    @Column(length = 2000)
    String description;
    String owner;

}
