package com.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dev.properties")
@ConfigurationProperties(prefix = "dev")
public class DevProperties {
    private String name;

    private int age;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name =name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age =age;
    }
}
