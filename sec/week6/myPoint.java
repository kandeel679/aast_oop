package sec.week6;

public class myPoint {
    private double x,y;
    public myPoint(){
        this(0,0);
    }
    public myPoint(double x,double y){
        this.y =y;
        this.x= x;
    }
    public double distance(myPoint p){
        return Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(this.y-p.y,2));
    }
    public double distance(double x,double y){
        return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(this.y-y,2));
    }
    public static double distance(myPoint p1,myPoint p2){
        return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p2.y-p1.y,2));
    }
}
