package com.company.Adapter;

public class Main {

    public static void main(String[] args) {
        SelectableUniversalAdapter adapter = new SelectableUniversalAdapter();
        adapter.setTarget(new TargetA(new AdapteeA()));
        adapter.req1();
    }
}
