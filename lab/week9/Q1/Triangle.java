package lab.week9.Q1;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    Triangle (){
        super();
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    Triangle(String color,boolean filled , double side1, double side2,double side3){
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    @Override
    public String toString() {
        return super.toString()+" Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
    }
    @Override
    public double getArea() {
        double s = (side1+side2+side3)/2;
        return Math.sqrt((s-side1)*(s-side2)*(s-side3)*(s));
        
    }
    @Override
    public double getPerimeter() {        
        return side1+side2+side3;
    }
    
}
