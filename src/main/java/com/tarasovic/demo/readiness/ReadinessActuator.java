package com.tarasovic.demo.readiness;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "readiness")
public class ReadinessActuator {

    private String ready = "NOT_READY";

    @ReadOperation
    public String getReadiness(){
        return ready;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void setReady(){
        ready = "READY";
    }
}
