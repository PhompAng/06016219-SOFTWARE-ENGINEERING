package com.company.PowerPlant;

public class Main {

    public static void main(String[] args) {
	    PowerPlant coalPowerPlant = new CFPP();
	    coalPowerPlant.startOperation();

        System.out.println("----------------------------");

	    PowerPlant gasPowerPlant = new GNFPP();
	    gasPowerPlant.startOperation();

        System.out.println("----------------------------");

	    coalPowerPlant.stopOperation();
        System.out.println("----------------------------");
	    gasPowerPlant.stopOperation();
    }
}
