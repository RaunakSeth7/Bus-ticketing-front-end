package com.example.practice.model;

public class ticketsview {
    String desti1,desti2,time1,time2,tottime,price,distance;

    public ticketsview(String desti1, String desti2, String time1, String time2, String tottime, String price, String distance) {
        this.desti1 = desti1;
        this.desti2 = desti2;
        this.time1 = time1;
        this.time2 = time2;
        this.tottime = tottime;
        this.price = price;
        this.distance = distance;
    }

    public String getDesti1() {
        return desti1;
    }

    public void setDesti1(String desti1) {
        this.desti1 = desti1;
    }

    public String getDesti2() {
        return desti2;
    }

    public void setDesti2(String desti2) {
        this.desti2 = desti2;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getTottime() {
        return tottime;
    }

    public void setTottime(String tottime) {
        this.tottime = tottime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
