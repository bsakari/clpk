package com.example.emobilis.elimuassistant;

public class Report {
    private String x,y,z;

    public Report(String x, String y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Report() {
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }
}
