package com.company;

import java.util.Random;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class AudioMedia implements Media {
    private int id;

    public AudioMedia() {
        id = new Random().nextInt();
    }

    @Override
    public void play() {
        System.out.println("Playing Audio " + id);
    }
}
