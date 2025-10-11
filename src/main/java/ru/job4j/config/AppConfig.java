package ru.job4j.config;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class AppConfig implements BeanNameAware {

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name assigned by Spring context: " + name);
    }

    @Value("${telegram.bot.name}")
    private String appName;

    public void printConfig() {
        System.out.println("App Name: " + appName);
    }
}
