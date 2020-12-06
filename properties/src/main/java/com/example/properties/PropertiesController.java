package com.example.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {
    @Autowired
    public DevProperties devProperties;
    @Autowired
    public AppProperties appProperties;

    @GetMapping("/")
    public String index() {
        String app = "app name: " + appProperties.name + " age: " + appProperties.age;
        String dev = "dev name: " + devProperties.getName() + " age: " + devProperties.getAge();
        return "properties:\n" + app + "\n" + dev;
    }
}
