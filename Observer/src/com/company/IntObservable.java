package com.company;

import java.util.LinkedList;

/**
 * Created by phompang on 11/27/2016 AD.
 */
public class IntObservable implements Observable {

    private LinkedList<Observer> observers;
    private int num;

    public IntObservable(int num) {
        this.observers = new LinkedList<>();
        this.setNum(num);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(int num) {
        for (Observer observable: observers) {
            observable.update(num);
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        notifyObserver(num);
    }
}
