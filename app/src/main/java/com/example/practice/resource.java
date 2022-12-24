package com.example.practice;

public class resource {
    String white,black;
    Integer imageurl;
    public resource(String white, String black,Integer imageurl) {
        this.white = white;
        this.black = black;
        this.imageurl=imageurl;
    }

    public String getWhite() {
        return white;
    }

    public void setWhite(String white) {
        this.white = white;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }
    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }
}
