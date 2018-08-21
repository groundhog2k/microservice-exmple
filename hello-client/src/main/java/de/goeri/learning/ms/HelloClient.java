package de.goeri.learning.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Component
public class HelloClient implements CommandLineRunner {
    @Autowired
    RestTemplate restTemplate;

    public HelloClient() {

    }

    public void run(String... args) throws Exception {
        String message = restTemplate.getForObject("http://helloWorld-service/hello", String.class);
        System.out.println(message);
    }
}
