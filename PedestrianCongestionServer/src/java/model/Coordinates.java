package model;


public class Coordinates {

    Integer id;
    double currentLatitude;
    double currentLongitude;
    double timestamp;
    String android_id;

    public Coordinates() {
    }

    public Coordinates(Integer id, double currentLatitude, double currentLongitude, double timestamp, String android_id) {
        this.id = id;
        this.currentLatitude = currentLatitude;
        this.currentLongitude = currentLongitude;
        this.timestamp = timestamp;
        this.android_id = android_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public double getCurrentLatitude() {
        return currentLatitude;
    }

    public void setCurrentLatitude(double currentLatitude) {
        this.currentLatitude = currentLatitude;
    }

    public double getCurrentLongitude() {
        return currentLongitude;
    }

    public void setCurrentLongitude(double currentLongitude) {
        this.currentLongitude = currentLongitude;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(double timestamp) {
        this.timestamp = timestamp;
    }

    

    public String getAndroid_id() {
        return android_id;
    }

    public void setAndroid_id(String android_id) {
        this.android_id = android_id;
    }
}
