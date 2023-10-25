package sec.week4;

public class Rectangle {
    private double width,height;
    

    public Rectangle(double w,double h){
        this.width = w;
        this.height = h;
    }
    public Rectangle(){
        this.height = 1;
        this.width = 1;
    }
    public double getArea(){
        
        return width*height;
    }
    public double getParamter(){
        return 2*(width+height);
    }
    public void set(double w,double h){
        this.height = h;
        this.width = w;
    }
    public void get(){


        
    }
}
