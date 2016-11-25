package com.company;

import java.util.Random;

/**
 * Created by phompang on 11/25/2016 AD.
 */
public class Singleton {
    private static Singleton sSingleton;

    private int num = 0;

    private Singleton () {
        setNum(new Random().nextInt());
    }

    public static Singleton getInstance() {
        if (sSingleton == null) {
            sSingleton = new Singleton();
        }
        return sSingleton;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
