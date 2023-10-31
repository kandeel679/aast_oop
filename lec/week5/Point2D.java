package lec.week5;

public class Point2D {
    private double x,y;
    public Point2D(){
        this(0,0);
        // using `this` >> to set a default value
    }
    public Point2D(double x,double y){
        this.x=x;
        this.y=y;
    }
    double getDistance(double x,double y){
        return (Math.sqrt(Math.pow(this.x-x, 2))+Math.pow(this.y-y, 2));

    }
    double getDistance( Point2D p){
        return (Math.sqrt(Math.pow(this.x-p.x, 2))+Math.pow(this.y-p.y, 2));
    }
}
