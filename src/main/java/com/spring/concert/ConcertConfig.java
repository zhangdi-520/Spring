package com.spring.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//启用AspectJ自动代理
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {

    @Bean
    public EncoreableIntroducer encoreableIntroducer(){
        return  new EncoreableIntroducer();
    }

    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public Performance dance(){
        return new Dance();
    }
}
