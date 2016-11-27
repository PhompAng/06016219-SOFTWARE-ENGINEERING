package com.company;

public class Main {

    public static void main(String[] args) {
        IntObservable intObservable = new IntObservable(10);
        HexObserver hexObserver = new HexObserver();
        BinObserver binObserver = new BinObserver();
        intObservable.addObserver(hexObserver);
        intObservable.addObserver(binObserver);

        intObservable.setNum(11);
    }
}
