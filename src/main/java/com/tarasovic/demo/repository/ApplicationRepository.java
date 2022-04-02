package com.tarasovic.demo.repository;

import com.tarasovic.demo.entities.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
