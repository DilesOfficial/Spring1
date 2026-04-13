package com.dilusha.config;

import com.dilusha.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "com2")
    public Desktop desktop() {
        return new Desktop();
    }
}
