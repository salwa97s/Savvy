package com.example.savvyapplication.ArrayClasses;

public class hobbies {

    private String hobby ;
    private int pic ;


    public hobbies(){}


    public hobbies(String hobby, int pic) {
        this.hobby = hobby;
        this.pic = pic;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
