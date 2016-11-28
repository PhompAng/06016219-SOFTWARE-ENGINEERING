package com.company.PowerPlant;

/**
 * Created by phompang on 11/28/2016 AD.
 */
public abstract class PowerPlant {
    protected Feeder feeder;
    private Boiler boiler;
    private Generator generator;

    public final void startOperation() {
        startFeeder();
        startBoiler();
        startGenerator();
    }

    protected abstract void startFeeder();
    private void startBoiler() {
        boiler = new Boiler();
        boiler.start();
        boiler.boilWater();
    }

    private void startGenerator() {
        generator = new Generator();
        generator.start();
        generator.getElectric();
    }

    public final void stopOperation() {
        stopFeeder();
        stopBoiler();
        stopGenerator();
    }

    protected abstract void stopFeeder();
    private void stopBoiler() {
        boiler.coolDown();
    }
    private void stopGenerator() {
        generator.stop();
    }
}
