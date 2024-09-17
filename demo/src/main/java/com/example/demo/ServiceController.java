package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class ServiceController {

    @PostMapping("/registerService")
    public String registerService(@RequestParam String serviceName, @RequestParam LocalDateTime serviceTime, @RequestParam String serviceComment) {
        // Logic to handle service registration
        System.out.println("Service Name: " + serviceName);
        System.out.println("Service Time: " + serviceTime);
        System.out.println("Service Comment: " + serviceComment);
        // Redirect or return view
        return "redirect:/success";
    }
}