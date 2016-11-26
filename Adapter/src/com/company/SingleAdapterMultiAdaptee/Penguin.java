package com.company.SingleAdapterMultiAdaptee;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class Penguin implements Bird {
    @Override
    public void fly() {

    }

    @Override
    public void jibjib() {
        System.out.println("Penguin Quack");
    }
}
