package com.tarasovic.demo.controller;

import com.tarasovic.demo.service.ApplicationService;
import com.tarasovic.demo.service.ReleaseService;
import com.tarasovic.demo.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class TzaController {

    private ApplicationService applicationService;
    private TicketService ticketService;
    private ReleaseService releaseService;

    @GetMapping("/applications")
    public String retrieveApplications(Model model){
        model.addAttribute("applications", applicationService.listApplications());
        return "applications";
    }

    @GetMapping("/tickets")
    public String retrieveTickets(Model model){
        model.addAttribute("tickets", ticketService.listTickets());
        return "tickets";
    }

    @GetMapping("/releases")
    public String retrieveReleases(Model model){
        model.addAttribute("releases", releaseService.listReleases());
        return "releases";
    }
}