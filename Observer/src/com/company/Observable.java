package com.company;

/**
 * Created by phompang on 11/27/2016 AD.
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(int num);
}
