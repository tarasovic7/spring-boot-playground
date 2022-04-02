package com.tarasovic.demo.service;

import com.tarasovic.demo.entities.Application;
import com.tarasovic.demo.exception.ApplicationNotFoundException;
import com.tarasovic.demo.repository.ApplicationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.StreamSupport.stream;

@Service
@AllArgsConstructor
public class ApplicationService {

    private ApplicationRepository applicationRepository;

    public List<Application> listApplications() {
        return stream(applicationRepository.findAll().spliterator(), false).collect(toList());
    }

    public Application findApplication(long id) {
        return applicationRepository.findById(id).orElseThrow(() -> new ApplicationNotFoundException("Application id " + id));
    }
}
