package com.preparation.spring.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.preparation.spring.Model, com.preparation.spring.Service, com.preparation.spring.Implementation")
public class AppConfig {


}
