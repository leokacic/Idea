package com.example.springboot.coronavirustracker.controller;

import com.example.springboot.coronavirustracker.models.LocationStats;
import com.example.springboot.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalCaseDifference= allStats.stream().mapToInt(stat -> stat.getDayDifference()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases",totalReportedCases);
        model.addAttribute("totalCaseDifference",totalCaseDifference);

        return "home";
    }
}
