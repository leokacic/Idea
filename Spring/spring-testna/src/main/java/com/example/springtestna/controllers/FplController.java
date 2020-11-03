package com.example.springtestna.controllers;

import com.example.springtestna.models.Players;
import com.example.springtestna.repository.FplRepository;
import com.example.springtestna.services.FplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FplController {

    @Autowired
    FplService fplService;

    List<Players> allPlayers;

    @RequestMapping("/")
    public String home() {
        allPlayers = fplService.getAllPlayers();

        return "home";
    }
}
