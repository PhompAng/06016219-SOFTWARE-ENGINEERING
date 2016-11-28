package com.company.Adapter;

/**
 * Created by phompang on 11/28/2016 AD.
 */
public class TargetB implements Target {
    private AdapteeB adapteeB;

    public TargetB(AdapteeB adapteeB) {
        this.adapteeB = adapteeB;
    }

    @Override
    public void req1() {
        adapteeB.reqB1();
    }

    @Override
    public void req2() {
        adapteeB.reqB2();
    }

    @Override
    public void req3() {
        adapteeB.reqB3();
    }
}
