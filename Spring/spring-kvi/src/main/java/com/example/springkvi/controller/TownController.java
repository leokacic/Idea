package com.example.springkvi.controller;

import com.example.springkvi.model.CoffeeBar;
import com.example.springkvi.model.Town;
import com.example.springkvi.service.TownService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
public class TownController {

    @Autowired
    TownService townService;

    @GetMapping("/")
    public String getData(Model model) throws IOException, ParseException {

        model.addAttribute("allTowns",townService.getAllTowns());
        return "home";
    }

    @GetMapping("/CoffeeBars/{id}")
    public String getCoffeeBars(@PathVariable("id")Long id, Model model) throws Exception {
        CoffeeBar coffeeBar = new CoffeeBar();
        Town town = townService.findById(id);
        model.addAttribute("townName",town);
        model.addAttribute("coffeeBar",coffeeBar);
        return "newCoffeeBarForm";
    }

    @PostMapping("/saveCoffeeBar")
    public String saveCoffeeBar(@ModelAttribute("coffeeBar") CoffeeBar coffeeBar) throws Exception {
        townService.saveCoffeeBar(coffeeBar);
        return "redirect:/";
    }
}
