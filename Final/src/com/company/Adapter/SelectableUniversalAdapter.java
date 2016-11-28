package com.company.Adapter;

/**
 * Created by phompang on 11/28/2016 AD.
 */
public class SelectableUniversalAdapter implements Target {

    private Target target;

    @Override
    public void req1() {
        target.req1();
    }

    @Override
    public void req2() {
        target.req2();
    }

    @Override
    public void req3() {
        target.req3();
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
