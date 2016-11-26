package com.company.SingleAdapterMultiAdaptee;

public class Main {

    public static void main(String[] args) {
        Adapter<Penguin> penguinAdapter = new Adapter<>(new Penguin());
        penguinAdapter.quack();
        penguinAdapter.fly();

        Adapter<FlappyBird> flappyBirdAdapter = new Adapter<>(new FlappyBird());
        flappyBirdAdapter.quack();
        flappyBirdAdapter.fly();
    }
}
