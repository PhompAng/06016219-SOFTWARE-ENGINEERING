package com.company;

public class Main {

    public static void main(String[] args) {
        MediaCollection mediaCollection = new MediaCollection();
        for (int i=0; i<2; i++) {
            mediaCollection.insert(new AudioMedia());
        }
        for (int i=0; i<2; i++) {
            mediaCollection.insert(new VideoMedia());
        }
        mediaCollection.insert(new AudioMedia());

        mediaCollection.play();
    }
}
