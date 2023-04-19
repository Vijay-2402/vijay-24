package com.vijay;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@EnableWebMvc
@ComponentScan("com.vijay")
public class MvcConfig  extends WebMvcConfigurerAdapter{

}