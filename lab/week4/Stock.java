package lab.week4;


public class Stock {
    private String symbol,name;
    private double previousClosingPrice=34.5,currentPrice = 34.35;
    public Stock(String s,String n){
        this.symbol = s;
        this.name= n;
    }
    public Stock(){
        this.symbol = "";
        this.name = "";
    }
    public   double getChangePercent(){

        return ((currentPrice-previousClosingPrice)/currentPrice)*100;
    }
    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }

    public double getpreviousClosingPrice(){
        return previousClosingPrice;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }
    public void setNmae(String n){
        this.name =n;
    }
    public void setSymbol(String s){
        this.symbol =s;
    }
    public void setCurrentPrice(double c){
        this.currentPrice =c;
    }
    public void setPerviousClosingPrice(double p){
        this.previousClosingPrice = p;
    }
    
    

}
