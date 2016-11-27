package com.company;

/**
 * Created by phompang on 11/27/2016 AD.
 */
public class HexObserver implements Observer {
    private int num;

    @Override
    public void update(int num) {
        this.num = num;
        System.out.println(Integer.toHexString(num));
    }
}
