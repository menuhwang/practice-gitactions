package com.example.gitaction;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {
    private final HelloService helloService = new HelloService();

    @Test
    void great_true() {
        Map<String, String> EXPECTED = new HashMap<>();
        EXPECTED.put("great", "hi");

        Map<String, String> result = helloService.great(true);

        assertEquals(EXPECTED.get("great"), result.get("great"));
    }

    @Test
    void great_false() {
        Map<String, String> EXPECTED = new HashMap<>();
        EXPECTED.put("great", "by");

        Map<String, String> result = helloService.great(false);

        assertEquals(EXPECTED.get("great"), result.get("great"));
    }
}