package com.company;

public class Main {

    public static void main(String[] args) {
	    ServerFacade serverFacade = new ServerFacade(new Nginx(), new Mysql());
	    serverFacade.start();
	    serverFacade.stop();
    }
}
