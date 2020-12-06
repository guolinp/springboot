package com.example.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {
    @Value("${app.name}")
    public String name;
    @Value("${app.age}")
    public int age;
}
