package com.company.PowerPlant;

/**
 * Created by phompang on 11/28/2016 AD.
 */
public class GasInjectionMotor extends Feeder {
    @Override
    void start() {
        System.out.println("Start Gas Injection Motor");
    }

    @Override
    void stop() {
        System.out.println("Stop Gas Injection Motor");
    }
}
