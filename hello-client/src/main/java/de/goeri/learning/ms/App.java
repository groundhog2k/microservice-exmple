package de.goeri.learning.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class App 
{
    public static void main( String[] args ) throws Exception {
        new SpringApplicationBuilder(App.class).web(false).run(args);

        Thread.sleep(5000);
    }
}
