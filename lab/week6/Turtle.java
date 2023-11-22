package lab.week6;

public class Turtle {
    private String name;
    private String direction;
    private double xPos;
    private double yPos;
    public Turtle(){
        this("Cherry","North",0,0);
    }
    public Turtle(String name, String direction, double xPos, double yPos) {
        this.name = name;
        this.direction = direction;
        this.xPos = xPos;
        this.yPos = yPos;
    }
    public void moveForward(){
        if ((this.xPos <-99 || this.xPos > 99) ||(this.yPos <-99 || this.yPos > 99)) {
            System.out.println("You are out of range!!");
        }else{
            switch (this.direction) {
                case "North":
                    this.yPos++;break;
                case "South":
                    this.yPos--;
                    break;
                case "East":
                    this.xPos++;
                    break;
                case "West":
                    this.xPos--;
                    break;
            
                default:
                    break;
            }
        }
    }
    public void moveBackword(){
        if ((this.xPos <-99 || this.xPos > 99) ||(this.yPos <-99 || this.yPos > 99)) {
            System.out.println("You are out of range!!");
        }else{
            switch (this.direction) {
                case "North":
                    this.yPos--;
                    break;
                case "South":
                    this.yPos++;
                    break;
                case "East":
                    this.xPos--;
                    break;
                case "West":
                    this.xPos++;
                    break;
            
                default:
                    break;
           }
        }
    }
    public void turnLeft(){
        switch (this.direction) {
            case "North":
                this.direction = "West";
                break;
            case "East":
                this.direction = "North";
                break;
            case "South":
                this.direction = "East";
                break;
            case "West":
                this.direction = "South";
                break;
            default:
                break;
        }
    }
    public void turnRight(){
        switch (this.direction) {
            case "North":
                this.direction = "East";
                break;
            case "East":
                this.direction = "South";
                break;
            case "South":
                this.direction = "West";
                break;
            case "West":
                this.direction = "North";
                break;
            default:
                break;
        }
    }





    @Override
    public String toString() {
        return "Turtle [name=" + name + ", direction=" + direction + ", xPos=" + xPos + ", yPos=" + yPos + "]";
    }
    //setters and getters 
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDirection() {
            return direction;
        }
        public void setDirection(String direction) {
            this.direction = direction;
        }
        public double getxPos() {
            return xPos;
        }
        public void setxPos(double xPos) {
            this.xPos = xPos;
        }
        public double getyPos() {
            return yPos;
        }
        public void setyPos(double yPos) {
            this.yPos = yPos;
    }


    


}
