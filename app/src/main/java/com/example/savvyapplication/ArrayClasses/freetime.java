package com.example.savvyapplication.ArrayClasses;

public class freetime {

    private String Day ;
    private String Hours;
    private int photo ;
    private String Date ;
    

    public freetime(){}

    public freetime(String day, String hours, int photo , String date) {
        Day = day;
        Hours = hours;
        this.photo = photo;
        Day=day ;
    }


    public String getDate() {
        return Date;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getHours() {
        return Hours;
    }

    public void setHours(String hours) {
        Hours = hours;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
