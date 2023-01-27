package com.example.gitaction;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HelloService {
    public Map<String, String> great(boolean bool) {
        Map<String, String> map = new HashMap<>();
        if (bool) {
            map.put("great", "hi");
            return map;
        }
        map.put("great", "by");
        return map;
    }
}
