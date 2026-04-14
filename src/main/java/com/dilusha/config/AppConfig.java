package com.dilusha.config;

import com.dilusha.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    //@Bean(name = "com2")
    @Bean
    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }
}
