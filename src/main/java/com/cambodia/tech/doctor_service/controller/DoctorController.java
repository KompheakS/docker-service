package com.cambodia.tech.doctor_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping
    public String getDoctor(){
        return "Hello I am a doctor brother!";
    }

}
