package com.sanjit.app.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.sanjit.app.controller","com.sanjit.Model","com.sanjit.Service"})
@EntityScan("com.sanjit.Service")
@SpringBootApplication
public class SpringBootApp extends SpringBootServletInitializer {
 public static void main(String[] args) 
        {
	 SpringApplication.run(SpringBootApp.class, args);
 }
 
 @Override
 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
     return application.sources(SpringBootApp.class);
 }
}