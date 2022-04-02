package com.tarasovic.demo.repository;

import com.tarasovic.demo.entities.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Integer> {
}
