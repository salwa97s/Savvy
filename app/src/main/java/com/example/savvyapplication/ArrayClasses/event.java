package com.example.savvyapplication.ArrayClasses;

public class event {

    private String Title;
    private String Date;
    private String Time ;
    private String DateTotal ;
    private String Description;
    private String Descriptionlong;
    private String Location ;
    private String Price ;
    private int photo ;

    public event(){}

    public event(String title, String date,String datetotal,String time, String description ,String descriptionlong ,  String location,String price , int photo) {
        Title = title;
        Date = date;
        Time =time;
        DateTotal = datetotal;
        Description = description;
        Descriptionlong = descriptionlong;
        Location = location;
        Price = price;
        this.photo = photo;
    }

    public String getTime() {
        return Time;
    }

    public String getDateTotal() {
        return DateTotal;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDescriptionlong() {
        return Descriptionlong;
    }

    public String getPrice() {
        return Price;
    }
}
