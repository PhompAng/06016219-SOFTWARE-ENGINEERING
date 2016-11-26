package com.company.Doubleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class Doubleton {
    private static ArrayList<Doubleton> doubletonArrayList = new ArrayList<>();
    private int num;

    private Doubleton() {
        this.setNum(new Random().nextInt());
    }

    public static Doubleton getIntance(int index) throws Exception {
        if (index > 2) {
            throw new Exception("Fuck");
        }

        if (doubletonArrayList.size() == 0) {
            doubletonArrayList.add(null);
            doubletonArrayList.add(null);
        }

        if (doubletonArrayList.get(index) == null) {
            Doubleton d = new Doubleton();
            doubletonArrayList.set(index, d);
        }
        return doubletonArrayList.get(index);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
