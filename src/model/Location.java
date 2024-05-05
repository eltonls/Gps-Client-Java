package model;

import java.util.Calendar;
import java.util.Map;

public class Location {

    private double latitude;
    private double longitude;
    private Calendar date;

    public Location(double latitude, double longitude, Calendar date) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public Calendar getDate() {
        return date;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
