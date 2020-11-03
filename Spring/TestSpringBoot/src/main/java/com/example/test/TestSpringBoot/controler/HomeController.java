package com.example.test.TestSpringBoot.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        String leo = "leo";
        model.addAttribute("latestCases",leo);
        return "home";
    }

    @GetMapping("/added")
    public String added (@RequestParam("fname") Integer fname,@RequestParam("lname") Integer lname, Model model){

        int a =0,b=1;
        int[] k = new int[40];
        k[0]=1;
        k[1]=1;

        System.out.println(k[0]);
        System.out.println(k[1]);

        for(int i = 2;i<10;i++){
            k[i]=k[i-1]+k[i-2];
            model.addAttribute("counter",i);
            model.addAttribute("fname"+i,k[i]);
            System.out.println(k[i]);
        }


//        model.addAttribute("fname",fname);
        model.addAttribute("lname",lname);

        Integer added = fname + lname;
        model.addAttribute("added",added);
        return "added";
    }
}
