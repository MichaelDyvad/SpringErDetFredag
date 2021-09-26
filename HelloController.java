package com.example.springhelloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Dette kaldes et endpoint
    @GetMapping("/first-mapping")
    public String helloWorld(){
        return "<b>HELLO WORLD<b>";
    }

    //endpoint
    @GetMapping("/second-mapping")
    public String secondMapping(){
        return "This is the second mapping";
    }

    @GetMapping("/")
    public String index(){
        return "Welcome to my Spring Application";
    }

    //Requester useren for en string
    @GetMapping("/parameter")
    public String parameter(@RequestParam String param){
        //localhost:8080/parameter?param=insetText
        return param + " " + "end of string";
    }

    //Er det fredag. Algoritme: Zellars Congruence by Christian Zellar
    @GetMapping("/www.ErDetFredag.dk")
    public String erDet(){
        int q = 24;
        double j = 2021/100;
        double k = 2021%100;
        double m = 9;

        double h = (q + Math.floor(((13*(m+1))/5)) + k + Math.floor((k/4)) + Math.floor((j/4)) - 2*j) % 7;
        double d = ((h + 5)%7)+1;

        if(d == 5){
            return "<b>JADETERFUCKINGFREDAG DANSKE UL!!!<b>";
        }else{
            return "Det blev ikke fredag";
        }
    }


}