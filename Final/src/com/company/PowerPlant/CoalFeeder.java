package com.company.PowerPlant;

/**
 * Created by phompang on 11/28/2016 AD.
 */
public class CoalFeeder extends Feeder {
    @Override
    void start() {
        System.out.println("Start Coal Feeder");
    }

    @Override
    void stop() {
        System.out.println("Stop Coal Feeder");
    }
}
