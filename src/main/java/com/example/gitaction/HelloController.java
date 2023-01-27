package com.example.gitaction;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class HelloController {
    private final HelloService helloService;
    @GetMapping("/{bool}")
    public Map<String, String> hello(@PathVariable boolean bool) {
        return helloService.great(bool);
    }
}
