package com.company.Adapter;

/**
 * Created by phompang on 11/28/2016 AD.
 */
public class TargetC implements Target {
    private AdapteeC adapteeC;

    public TargetC(AdapteeC adapteeC) {
        this.adapteeC = adapteeC;
    }

    @Override
    public void req1() {
        adapteeC.reqC1();
    }

    @Override
    public void req2() {
        adapteeC.reqC2();
    }

    @Override
    public void req3() {
        adapteeC.reqC3();
    }
}
