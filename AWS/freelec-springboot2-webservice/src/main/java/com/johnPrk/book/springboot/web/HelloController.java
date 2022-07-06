package com.johnPrk.book.springboot.web;

import com.johnPrk.book.springboot.web.DTO.HelloResponseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDTO helloResponseDTO(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDTO(name, amount);
    }
}
