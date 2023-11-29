package lab.week9.Q1;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dataCreated;



    
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public void setDataCreated(Date dataCreated) {
        this.dataCreated = dataCreated;
    }
    public GeometricObject() {
        color = "";
        filled = false;
        dataCreated = new Date();
    }
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dataCreated = new Date();
    }


    public abstract double getArea();
    public abstract double getPerimeter();
    
    @Override
    public String toString() {
        return "GeometricObject [color=" + color + ", filled=" + filled + "]";
    }


    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
    public Date getDataCreated() {
        return dataCreated;
    }
    

}
