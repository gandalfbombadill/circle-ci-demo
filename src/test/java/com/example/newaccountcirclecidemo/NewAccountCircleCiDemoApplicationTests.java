package com.example.newaccountcirclecidemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class NewAccountCircleCiDemoApplicationTests
{
    @LocalServerPort
    private int port;

    @Autowired
    private ApplicationContext context;

    @Test
    public void contextLoadsTest()
    {
        assertNotNull(context);

        System.out.println("Context loaded!");
    }

    @Test
    public void homePathTest()
    {
        RestTemplate template = new RestTemplate();
        ResponseEntity<String> response = template.getForEntity(
            "http://localhost:" + port,
            String.class
        );

        assertEquals(200, response.getStatusCode().value());
        assertEquals("Hello, world!", response.getBody());

        System.out.println("Home path available");
    }
}
