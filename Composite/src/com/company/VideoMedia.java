package com.company;

import java.util.Random;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class VideoMedia implements Media {
    private int id;

    public VideoMedia() {
        id = new Random().nextInt();
    }

    @Override
    public void play() {
        System.out.println("Playing Video " + id);
    }
}
