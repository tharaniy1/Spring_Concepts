package com.preparation.spring.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages= {"com.preparation.spring.*"})
@EnableAspectJAutoProxy
public class AppConfig {

}
