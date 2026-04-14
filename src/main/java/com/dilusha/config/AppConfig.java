package com.dilusha.config;

import com.dilusha.Alien;
import com.dilusha.Computer;
import com.dilusha.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.AliasFor;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien(@Autowired Computer com){
        Alien obj = new Alien();
        obj.setAge(30);
        obj.setCom(com);

        return obj;
    }

    //@Bean(name = "com2")
    @Bean
//    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }
}
