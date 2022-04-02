package com.tarasovic.demo.service;

import com.tarasovic.demo.entities.Application;
import com.tarasovic.demo.entities.Release;
import com.tarasovic.demo.repository.ApplicationRepository;
import com.tarasovic.demo.repository.ReleaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReleaseService {

    private ReleaseRepository releaseRepository;

    public Iterable<Release> listReleases(){
        return releaseRepository.findAll();
    }

}
