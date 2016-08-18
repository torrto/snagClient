package com.springapp.mvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by rhy704 on 8/14/16.
 */
@Configuration
@ComponentScan(basePackages = { "com.springapp.mvc" },
        excludeFilters = {
                @ComponentScan.Filter(type= FilterType.ANNOTATION, value= EnableWebMvc.class)
        })
public class RootConfig {
}