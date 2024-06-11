package com.navr.springweb.helloemployee.controller;

import com.navr.springweb.helloemployee.dto.HelloResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/helloworld/api")
public class HelloWorldController {

    @GetMapping(value = "/hello_text",
            produces = {MediaType.TEXT_PLAIN_VALUE})
    public String hello() {
        return "Hello World!";
    }

    @GetMapping(value = "/hello_json",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public HelloResponse helloResponse() {
        HelloResponse helloResponse = new HelloResponse();
        helloResponse.setResponse("This is Hello World Response");
        return helloResponse;
    }

}
