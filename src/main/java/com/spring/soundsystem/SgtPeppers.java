package com.spring.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt. Pepper Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by "+artist);
    }

    public void out(){
        System.out.println("aaa");
    }
}
