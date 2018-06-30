package com.isaacray.versiondemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
@PropertySource("classpath:gradle.properties")
public class AppConfig {
    @Value("${version}")
    private String applicationVersion;

    @ModelAttribute("applicationVersion")
    public String getApplicationVersion() {
        return applicationVersion;
    }
}
