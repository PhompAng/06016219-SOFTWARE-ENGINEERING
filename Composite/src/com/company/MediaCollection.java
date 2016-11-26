package com.company;

import java.util.LinkedList;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class MediaCollection implements Media {
    private LinkedList<Media> medias;

    public MediaCollection() {
        medias = new LinkedList<>();
    }

    public void insert(Media media) {
        medias.add(media);
    }

    public void remove(Media media) {
        medias.remove(media);
    }

    public void remove(int index) {
        medias.remove(index);
    }

    public Media getMedia(int index) {
        return medias.get(index);
    }

    @Override
    public void play() {
        for (Media media: medias) {
            media.play();
        }
    }
}
