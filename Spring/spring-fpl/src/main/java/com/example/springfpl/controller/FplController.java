package com.example.springfpl.controller;

import com.example.springfpl.models.FplStats;
import com.example.springfpl.models.PlayerContact;
import com.example.springfpl.repositories.ContactRepository;
import com.example.springfpl.services.FplDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Controller
public class FplController {

    @Autowired
    FplDataService fplDataService;
    @Autowired
    ContactRepository contactRepository;

    @GetMapping("/fpl")
    public String home(Model model) throws IOException, InterruptedException {
        List<FplStats> allStats = fplDataService.getAllStats();
        fplDataService.getAllStatsSorted(allStats,"TotalPoints");
        PlayerContact playerContact = new PlayerContact();
        playerContact.setContact(1111111);
        playerContact.setName("Ryan");
        contactRepository.save(playerContact);
        final int averagePoints = (allStats.stream().mapToInt(p-> p.getTotalPoints()).sum())/(fplDataService.getSize());
        model.addAttribute("fplStats", allStats);
        model.addAttribute("averagePoints", averagePoints);
        return "home";
    }

    @GetMapping(path ="/fpl/{name}")
    public String name(@PathVariable("name") String name, Model model) throws Exception {
        if(name.equals(null)){
            throw new Exception("No Value Present");
        }
        List<FplStats> allStats = fplDataService.getAllStats();
        try {
            Optional<FplStats> statsByName = allStats.stream().filter(p->p.getName().equals(name)).findFirst();
            System.out.println(statsByName);
            model.addAttribute("statsByName", statsByName.get());
        } catch(NoSuchElementException e) {
            throw new NoSuchElementException("No Value Present");
        }

        return "name";
    }
}
