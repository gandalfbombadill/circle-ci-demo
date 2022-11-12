package com.example.newaccountcirclecidemo.controller;

import com.example.newaccountcirclecidemo.services.NamesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController
{
    private NamesService service;

    public HelloWorldController(NamesService service)
    {
        this.service = service;
    }

    @GetMapping
    public String sayMessage()
    {
        return "Hello, world!";
    }

    @GetMapping("names")
    public List<String> getNames()
    {
        return service.getNames();
    }
}
