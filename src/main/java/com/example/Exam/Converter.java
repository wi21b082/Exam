package com.example.Exam;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Converter {

    @RequestMapping("/")
    public String index() {
        return "Hello";
    }

    @RequestMapping ("/ouncetogram")
    public double ounceToGram (double a) {
        double b = 28.35;
        return a * b;
    }

    @RequestMapping ("/stonetokilogram")
    public double stoneToKilo (double c) {
        double d = 6.35;
        return c * d;



    }
}
