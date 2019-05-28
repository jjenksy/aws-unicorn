package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Slf4j
@EnableScheduling
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
//        testServiceRouter();
        testLambda();
        testReverser();
        testLeader();
        testOtherLeader();
        testOtherReverser();
        testOtherSwapCaser();
    }

    private void testServiceRouter() {
        RestTemplate restTemplate = new RestTemplate();
        String serviceRouter = "http://modul-LoadB-1GW2PS5A0PR1A-1573975006.us-east-1.elb.amazonaws.com";
        ResponseEntity<String> response
                = restTemplate.getForEntity(serviceRouter, String.class);
        if(!response.getStatusCode().is2xxSuccessful()) {
            log.error("Service router {}", response);
        }

    }

    private void testLambda() {
        RestTemplate restTemplate = new RestTemplate();
        String serviceRouter = "https://sn85p49ob4.execute-api.us-east-1.amazonaws.com/api/";
        ResponseEntity<String> response
                = restTemplate.getForEntity(serviceRouter, String.class);
        if(!response.getStatusCode().is2xxSuccessful()) {
            log.error("Lambda {}", response);
        }

    }

    private void testReverser() {
        RestTemplate restTemplate = new RestTemplate();
        String serviceRouter = "http://reverser-1117432110.us-east-1.elb.amazonaws.com";
        ResponseEntity<String> response
                = restTemplate.getForEntity(serviceRouter, String.class);
        if(!response.getStatusCode().is2xxSuccessful()) {
            log.error("Reverser {}", response);
        }

    }

    private void testLeader() {
        RestTemplate restTemplate = new RestTemplate();
        String serviceRouter = "http://leeder-114258218.us-east-1.elb.amazonaws.com";
        ResponseEntity<String> response
                = restTemplate.getForEntity(serviceRouter, String.class);
        if(!response.getStatusCode().is2xxSuccessful()) {
            log.error("Leader {}", response);
        }

    }

    /**
     *
     http://34.200.243.17/
     reverser
     BabyYouCanChiveMyCar

     http://lmleeter-env.ggeydfrafw.us-east-1.elasticbeanstalk.com/
     leeter
     BabyYouCanChiveMyCar

     https://6wgwo7fahi.execute-api.us-east-1.amazonaws.com/api/
     */


    private void testOtherLeader() {
        RestTemplate restTemplate = new RestTemplate();
        String serviceRouter = "http://7elasticlandfill-env.emmdgjmnpw.us-east-1.elasticbeanstalk.com/";
        ResponseEntity<String> response
                = restTemplate.getForEntity(serviceRouter, String.class);
        if(!response.getStatusCode().is2xxSuccessful()) {
            log.error("Other Leader {}", response);
        }

    }

    private void testOtherReverser() {
        RestTemplate restTemplate = new RestTemplate();
        String serviceRouter = "http://reverser-1432014483.us-east-1.elb.amazonaws.com";
        ResponseEntity<String> response
                = restTemplate.getForEntity(serviceRouter, String.class);
        if(!response.getStatusCode().is2xxSuccessful()) {
            log.error("Other Reverser {}", response);
        }

    }


    private void testOtherSwapCaser() {
        RestTemplate restTemplate = new RestTemplate();
        String serviceRouter = "https://7zv6762nc5.execute-api.us-east-1.amazonaws.com/api";
        ResponseEntity<String> response
                = restTemplate.getForEntity(serviceRouter, String.class);
        if(!response.getStatusCode().is2xxSuccessful()) {
            log.error("Other Swapcaser {}", response);
        }

    }
}
