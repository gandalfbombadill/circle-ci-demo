package com.example.newaccountcirclecidemo.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NamesService
{
    private List<String> names = List.of(
        "bob", "sue", "sandra", "ibby"
    );

    public List<String> getNames()
    {
        if (names.isEmpty())
        {
            throw new RuntimeException("Names list is empty");
        }
        return names;
    }
}
