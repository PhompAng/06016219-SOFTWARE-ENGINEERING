package com.company.Adapter;

/**
 * Created by phompang on 11/28/2016 AD.
 */
public class TargetA implements Target {
    private AdapteeA adapteeA;

    public TargetA(AdapteeA adapteeA) {
        this.adapteeA = adapteeA;
    }

    @Override
    public void req1() {
        adapteeA.reqA1();
    }

    @Override
    public void req2() {
        adapteeA.reqA2();
    }

    @Override
    public void req3() {
        adapteeA.reqA3();
    }
}
