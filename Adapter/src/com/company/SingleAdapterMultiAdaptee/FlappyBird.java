package com.company.SingleAdapterMultiAdaptee;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class FlappyBird implements Bird {
    @Override
    public void fly() {
        System.out.println("Flappy Bird Fly");
    }

    @Override
    public void jibjib() {

    }
}
