package com.company.Doubleton;

public class Main {

    public static void main(String[] args) {
        try {
            Doubleton d0 = Doubleton.getIntance(0);
            System.out.println("d0: " + d0.getNum());

            Doubleton d2 = Doubleton.getIntance(1);
            System.out.println("d2: " + d2.getNum());

            Doubleton d1 = Doubleton.getIntance(0);
            System.out.println("d1: " + d1.getNum());

            Doubleton d3 = Doubleton.getIntance(1);
            System.out.println("d3: " + d3.getNum());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
