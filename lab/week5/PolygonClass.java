package lab.week5;

import java.lang.Math;


public class PolygonClass {
    
    private int n;
    private double side;
    private double y; 
    private double x;
    public PolygonClass() {
        this(3, 1, 0, 0);
        
    }
    public PolygonClass(int n, double side) {
        this.n = n;
        this.side = side;
        this.y = 0;
        this.x = 0;
    }
    public PolygonClass(int n, double side, double y, double x) {
        this.n = n;
        this.side = side;
        this.y = y;
        this.x = x;
    }

    //getters and setters 
        public int getN() {
            return n;
        }
        public void setN(int n) {
            this.n = n;
        }
        public double getSide() {
            return side;
        }
        public void setSide(double side) {
            this.side = side;
        }
        public double getY() {
            return y;
        }
        public void setY(double y) {
            this.y = y;
        }
        public double getX() {
            return x;
        }
        public void setX(double x) {
            this.x = x;
        }
 public double getperimeter(){
    return this.n*this.side;
 }   
 public double getArea(){
    return (this.n *(this.side*this.side)) /4*Math.tan(Math.PI/n);
 }
     
}
