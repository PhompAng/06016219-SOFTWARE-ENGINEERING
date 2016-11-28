package com.company.PowerPlant;

/**
 * Created by phompang on 11/28/2016 AD.
 */
public class CFPP extends PowerPlant {
    @Override
    protected void startFeeder() {
        super.feeder = new CoalFeeder();
        super.feeder.start();
    }

    @Override
    protected void stopFeeder() {
        super.feeder.stop();
    }
}
