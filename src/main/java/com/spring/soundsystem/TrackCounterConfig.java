package com.spring.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisc cd = new BlankDisc();
        cd.setTitle("Sgt. Pepper Lonely Hearts Club Band");
        cd.setArtist("The Beatles");
        List<String> tracks = new ArrayList<>();
        tracks.add("111");
        tracks.add("222");
        tracks.add("333");
        tracks.add("444");
        tracks.add("555");
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
