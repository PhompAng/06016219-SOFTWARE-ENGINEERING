package com.company.Singleton;

public class Main {

    public static void main(String[] args) {
	    Singleton s1 = Singleton.getInstance();
        System.out.println("s1" + s1.getNum());
        Singleton s2 = Singleton.getInstance();
        System.out.println("s2" + s2.getNum());
    }
}
