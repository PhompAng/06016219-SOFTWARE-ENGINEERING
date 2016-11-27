package com.company;

/**
 * Created by phompang on 11/27/2016 AD.
 */
public class ServerFacade {
    private Nginx nginx;
    private Mysql mysql;

    public ServerFacade(Nginx nginx, Mysql mysql) {
        this.nginx = nginx;
        this.mysql = mysql;
    }

    public void start() {
        nginx.start();
        mysql.start();
    }

    public void stop() {
        nginx.stop();
        mysql.stop();
    }
}
