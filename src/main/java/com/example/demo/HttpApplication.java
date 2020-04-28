package com.example.demo;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HttpApplication {

    public static void main(String[] args) {
        //SpringApplication.run(HttpApplication.class, args);
        for(int i = 2; i < 5; i ++) {

            HttpResponse<String> response = Unirest.get("http://www.jipinsuren.com/page/"+i+"/")
                    .header("cache-control", "no-cache")
                    .header("Postman-Token", "d8d3a34b-09b0-42de-a5a0-601858cd53a9")
                    //.body("{ \"name\":\n}")
                    .asString();
        }
    }

}
